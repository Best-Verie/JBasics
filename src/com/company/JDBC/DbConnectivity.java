package com.company.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnectivity {
    private static  final String DB_DRIVER = "org.postgresql.Driver";
    private static  final String DB_URL = "jdbc:jdbc:postgresql://localhost:3306/rfid";
    private static  final String DB_USER = "root";
    private static  final String DB_PASSWORD = "password";

    public static void main(String[] args) {
        Connection connection = null;
        try{
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            if(connection != null){
                System.out.println("Connection Successful");
            }
            System.out.println("Connection failed!");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
