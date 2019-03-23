package com.dao.Impl;


import com.dao.LoginDao;
import com.db.DBConnect;
import com.eneity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDaoImpl implements LoginDao{
    @Override
    public boolean loginUser(User user) {
        boolean flag = false;
        try {
            DBConnect jdbc = new DBConnect();
            Connection conn = jdbc.getConnection();
            String login_sql = "select id from user where id = ? and password = ? and type=?";
            PreparedStatement ps = conn.prepareStatement(login_sql);
            ps.setString(1,user.getId());
            ps.setString(2, user.getPassword());
            ps.setInt(3,user.getType());
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                flag = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
