package org.codetemplates;


import com.mysql.cj.jdbc.MysqlDataSource;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * DB Connection using Mysql
 * */
public class DBConnection {
    public static void main(String[] args) throws SQLException {
        Connection con = null;

        // connect to the database
        MySqlConnect mySqlConnect = new MySqlConnect();
        con = mySqlConnect.connect();
        System.out.println("Connected to the database");

        // prepate a statement (query)
        PreparedStatement statement = con.prepareStatement("select * from T_Google");

        // execute a query and get the result set
        ResultSet resultSet = statement.executeQuery();

        for (;resultSet.next();) {
            System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
        }

        if (resultSet != null) {
            resultSet.close();
        }

        if (statement != null) {
            statement.close();
        }

        // close connection
        mySqlConnect.disconnect();
    }

    /**
     * Connection sample code
     * */
    public static Connection connectToDatabase() throws SQLException {

        // approach 1 (jdbc:dbserver://hostNameOrIP:portNumber/dbName)
        String url = "jdbc:mysql://localhost:3306/sys";
        String username = "root";
        String password = "baba2222";
        Connection connection = DriverManager.getConnection(url, username, password);

        // approach 2
//        MysqlDataSource dataSource = new MysqlDataSource();
//        dataSource.setURL("jdbc:mysql://localhost:3306/sys");
//        dataSource.setUser("root");
//        dataSource.setPassword("baba2222");
//        Connection connection1 = dataSource.getConnection();


        return connection;
    }
}
