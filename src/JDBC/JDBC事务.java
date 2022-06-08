package JDBC;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC事务 {
    public static void main(String[] args) throws Exception{
        //演示Jdbc中怎么使用事务
    }
    //没有使用事务的做法--A给B转100块钱，中间如果突然程序错误了但未执行完的结果还在。
    public void noTransaction() throws Exception{
    //操作转账的业务
        //得到连接
        java.sql.Connection connection = null;
        PreparedStatement preparedStatement = null;
        //得到一个sql
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        //创建PreStatement 对象
        try {

            connection = getConnection(); //默认情况下connection对象是默认自动提交
            //只要执行了这个语句，这个语句的内容就会默认提交到数据库
            preparedStatement = connection.prepareStatement(sql);
            //执行了第一条sql语句
            preparedStatement.executeLargeUpdate();
            int a = 1 / 0;
            //执行了第二条sql语句
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeLargeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //关闭资源
            connection.close();
        }
    }
    public  static  java.sql.Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/hsp_db03";
        String user ="root";
        String password = "hsp";
        java.sql.Connection connection = DriverManager.getConnection(url,user,password);
        return connection;
    }
    //事务来解决
    public void Transaction() throws Exception {
        //操作转账的业务
        //得到连接
        java.sql.Connection connection = null;
        PreparedStatement preparedStatement = null;
        //得到一个sql
        String sql = "update account set balance = balance - 100 where id = 1";
        String sql2 = "update account set balance = balance + 100 where id = 2";
        //创建PreStatement 对象
        try {

            connection = getConnection();
            //将connection设置成不自动提交
            connection.setAutoCommit(false);
            preparedStatement = connection.prepareStatement(sql);
            //执行了第一条sql语句
            preparedStatement.executeLargeUpdate();
            int a = 1 / 0;
            //执行了第二条sql语句
            preparedStatement = connection.prepareStatement(sql2);
            preparedStatement.executeLargeUpdate();

            //在这里进行提交的操作
            connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
            //这里进行回滚，撤销执行的sql，默认回滚到事务开始的状态
            try {
                connection.rollback();
            } catch (SQLException throwables) {

                throwables.printStackTrace();
            }
        } finally {
            //关闭资源
            connection.close();
        }
    }
}
