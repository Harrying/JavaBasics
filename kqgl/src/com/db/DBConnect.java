package com.db;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnect {
    static String DBDriver = null;
    static String DBUrl = null;
    static String DBRoot = null;
    static String DBPass = null;

    Connection connection = null;

    static {
        try {
            Properties properties = new Properties();
            InputStream inputStream = DBConnect.class.getClassLoader().getResourceAsStream("db.properties");
            properties.load(inputStream);

            DBDriver = properties.getProperty("DBDriver");
            DBUrl = properties.getProperty("DBUrl");
            DBRoot = properties.getProperty("DBRoot");
            DBPass = properties.getProperty("DBPass");
            System.out.println("***");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public Connection getConnection(){
        try {
            Class.forName(DBDriver);
            connection = DriverManager.getConnection(DBUrl, DBRoot, DBPass);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
