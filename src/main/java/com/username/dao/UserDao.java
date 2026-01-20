package com.username.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.userdata.DBConnection;

public class UserDao {

    public boolean insertUser(String name, int age, String profession) {

        boolean status = false;

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name, age, profession) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, profession);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                status = true;
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }
}
