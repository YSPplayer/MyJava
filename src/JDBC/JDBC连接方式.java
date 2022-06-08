package JDBC;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBC连接方式 {
    public static void main(String[] args) {

    }
    //方式四:使用Class.forName自动注册驱动，简化代码
    public void connect04() throws Exception {
        //在加载driver时，会自动帮我们完成注册
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsp_db03";
        String user ="root";
        String password = "hsp";
        java.sql.Connection connection =DriverManager.getConnection(url,user,password);
        System.out.println("第四种方式" + connection);

    }

    //方式三 使用DriverManger 替换 Driver 进行统一管理
    public void connect03() throws Exception{
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        //下一步，创建url和user和password
        String url = "jdbc:mysql://localhost:3306/hsp_db03";
        String user ="root";
        String password = "hsp";
        DriverManager.registerDriver(driver);//注册Driver驱动

        java.sql.Connection connect =   DriverManager.getConnection(url,user,password);
        System.out.println(connect);

    }



    //方式二
    public void connect02() throws Exception,ClassNotFoundException, InstantiationException, IllegalAccessException {
        //使用反射加载driver类
        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/hsp_db03";
        //将用户名和密码放在properties 对象
        Properties properties = new Properties();
        //说明：user和password是规定好的
        properties.setProperty("user","root");//用户
        properties.setProperty("password","hsp");//密码
        java.sql.Connection connect = driver.connect(url, properties);//连接数据库

        //反射加载：更加的灵活，减少依赖性
        System.out.println(connect);
    }
    //方式一
    public void connect01() throws SQLException{
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
