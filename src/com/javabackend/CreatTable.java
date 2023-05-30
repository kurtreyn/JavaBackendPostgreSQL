package com.javabackend;
import java.sql.Connection;
import java.sql.Statement;

public class CreatTable {

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ConnectDB obj_ConnectDB = new ConnectDB();
        connection = obj_ConnectDB.getConnection();

        try {
            String query = "create table employee(id int primary key, name varchar(50), address text)";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table created successfully!");
        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}
