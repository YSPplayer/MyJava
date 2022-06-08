package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Random;

public class JDBC批处理 {
    public static void main(String[] args) throws Exception {
        noBatch();
    }
    //传统方法
    public static void noBatch() throws Exception {
        //拿到连接
        Connection connection = JDBC事务.getConnection();
        String sql ="insert into account values(null,?,?) ";
        PreparedStatement preparedStatement =  connection.prepareStatement(sql);
        for(int i = 0; i < 5000; i++) {
            //设置第一个参数
            preparedStatement.setString(1,"jack" + i );
            //设置后面的参数
            preparedStatement.setString(2,String.valueOf(Math.random()*1000));
            //执行，这种执行方法很慢
            preparedStatement.executeLargeUpdate();
        }
        //关闭连接
        connection.close();
        preparedStatement.close();
    }


    //批量方法添加数据
    public void batch()  throws Exception {
        //拿到连接
        Connection connection = JDBC事务.getConnection();
        String sql ="insert into account values(null,?,?) ";
        PreparedStatement preparedStatement =  connection.prepareStatement(sql);
        for(int i = 0; i < 5000; i++) {
            //设置第一个参数
            preparedStatement.setString(1,"jack" + i );
            //设置后面的参数
            preparedStatement.setString(2,String.valueOf(Math.random()*1000));
            //执行
            preparedStatement.addBatch();
            //当有1000条记录时再批量执行
            if(i + 1 % 1000 == 0) {
                //到1000批量执行
                preparedStatement.executeBatch();
                //清空一把
                preparedStatement.clearBatch();
            }

        }
        //关闭连接
        connection.close();
        preparedStatement.close();
    }

}
