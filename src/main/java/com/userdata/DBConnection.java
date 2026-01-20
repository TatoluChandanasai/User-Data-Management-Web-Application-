package com.userdata;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/userdata_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC",
                "root",
                "chandana@1614"
            );

            System.out.println("DB CONNECTED SUCCESSFULLY");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return con;
    }
}
