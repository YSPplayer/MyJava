package JDBC;


import com.mysql.jdbc.Connection;

import java.sql.Driver;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
//引入jar文件

public class JDBC使用 {
    public static void main(String[] args) throws SQLException {
        //前置工作：在项目下创建文件夹，将mysql.jar拷贝到目录下，点击add to project，加入到项目中

        //1.注册驱动
        com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();//创建Driver对象

        //2.得到连接

        //解读：规定一个好的，表示一个协议，通过jdbc的方式连接mysql
        //localhost是主机，也可以是ip地址，不在本机就写对应的ip地址
        //3306是sql监听的端口
        //hsp_db03连接到mysql的哪个数据库
        //连接本质就是前面的socket连接
        String url = "jdbc:mysql://localhost:3306/hsp_db03";
        //将用户名和密码放在properties 对象
        Properties properties = new Properties();
        //说明：user和password是规定好的
        properties.setProperty("user","root");//用户
        properties.setProperty("password","hsp");//密码
        java.sql.Connection connect = driver.connect(url, properties);//连接数据库

        //3.执行sql
        //插入
        String sql = "insert into actor values(null,'小明','男')";
        //修改
        String sql2 ="update actor set name = '小红' where id = null";

        //删除
        String sql3 ="delete from actor where id = null";



        //statement可以帮我们发送sql语句
        Statement statement = connect.createStatement();
        int rows = statement.executeUpdate(sql);//返回值表示受影响的行数，如果是dml语句，返回的是影响的行数



        //4.关闭连接资源
        statement.close();
        connect.close();
    }
}
