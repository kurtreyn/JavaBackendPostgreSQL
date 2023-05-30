package com.javabackend;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

    public static void main(String[] args) {
        ConnectDB obj_ConnectDB = new ConnectDB();
        System.out.println(obj_ConnectDB.getConnection());
    }

    public Connection getConnection() {
    Connection connection = null;
    String url = "jdbc:postgresql://localhost:5432/postgres";
    String user = "postgres";
    String password = "";
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(url, user, password);

            if(connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return connection;
    }
}
