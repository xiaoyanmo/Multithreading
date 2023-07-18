package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyObject {


    public enum MyEnumSingleton {
        connectionFactory;

        private Connection connection;

        /**
         * 个人建议改成mysql，postgres等其他驱动
         */
        MyEnumSingleton() {
            try {
                System.out.println("调用了MyObject的构造");
                String driverName = "com.mysql.cj.jdbc.Driver";
                Class.forName(driverName);

                String url = "jdbc:mysql://localhost:3306/spring?useSSL=false";
                String username = "root";
                String password = "123456";
                connection = DriverManager.getConnection(url, username, password);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }

        public Connection getConnection() {
            return connection;
        }
    }

    public static Connection getConnection() {
        return MyEnumSingleton.connectionFactory.getConnection();
    }
}