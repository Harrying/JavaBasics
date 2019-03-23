package com.dao.Impl;

import com.dao.UserDao;
import com.db.DBConnect;
import com.eneity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public boolean addUser(User user) {
        boolean flag = false;
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        try {
            String sql = "insert into user(id, password, type, name, age, sex, department, salary) values (?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,user.getId());
            preparedStatement.setString(2,user.getPassword());
            preparedStatement.setInt(3,user.getType());
            preparedStatement.setString(4,user.getName());
            preparedStatement.setInt(5,user.getAge());
            preparedStatement.setString(6,user.getSex());
            preparedStatement.setString(7,user.getDepartment());
            preparedStatement.setFloat(8,user.getSalary());
            int update = preparedStatement.executeUpdate();
            if (update>0){
                flag = true;
                System.out.println("添加成功");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean deleteUser(User user) {
        boolean flag = false;
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        try {
            String sql = "delete from user where id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getId());
            int update = preparedStatement.executeUpdate();
            if (update>0){
                flag = true;
                System.out.println("删除成功");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean updateUser(int id,User user) {
        boolean flag = false;
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        try {
            String sql = "update user set password=?,department=?  where id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setString(2,user.getDepartment());
            preparedStatement.setInt(3,id);
            int update = preparedStatement.executeUpdate();
            if (update>0){
                flag = true;
                System.out.println("修改成功");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public List<User> selectUser( ) {
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        List<User> list = new ArrayList<User>();
        try {
            String sql = "select id, name, age, sex, department, salary from user";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                User u = new User();
                u.setId(resultSet.getString("id"));
                u.setName(resultSet.getString("name"));
                u.setAge(resultSet.getInt("age"));
                u.setSex(resultSet.getString("sex"));
                u.setDepartment(resultSet.getString("department"));
                u.setSalary(resultSet.getFloat("salary"));
                list.add(u);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("显示");
        return list;
    }

    @Override
    public List<User> selectOneUser(User user) {
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        List<User> list = new ArrayList<User>();
        ResultSet resultSet = null;
        try {
            String sql = "select id, name, age, sex, department, salary from user where  ";
            if("" == user.getId() || user.getId().equals("")){
                sql = sql+" 1=1";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
            }else{
                sql = sql+" id = ?";
                PreparedStatement preparedStatement1 = connection.prepareStatement(sql);
                preparedStatement1.setString(1, user.getId());
                resultSet = preparedStatement1.executeQuery();
            }
            while(resultSet.next()){
                User user1 = new User();
                user1.setId(resultSet.getString("id"));
                user1.setName(resultSet.getString("name"));
                user1.setAge(resultSet.getInt("age"));
                user1.setSex(resultSet.getString("sex"));
                user1.setDepartment(resultSet.getString("department"));
                user1.setSalary(resultSet.getFloat("salary"));
                list.add(user1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}
