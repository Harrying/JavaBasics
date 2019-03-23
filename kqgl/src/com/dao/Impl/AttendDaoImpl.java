package com.dao.Impl;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.sql.Connection;
import java.util.Map;

import com.dao.AttendDao;
import com.db.DBConnect;
import com.eneity.Attend;
import com.eneity.User;

public class AttendDaoImpl implements AttendDao {

    @Override
    public boolean addAttend(Attend attend) {
        boolean flag = false;
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        try{
            String sql = "insert into attend(id, kq_time, kq_1, kq_2, kq_3, kq_4, kq_type, start_time, stop_time, kq_salary) values (?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,attend.getId());
            preparedStatement.setString(2,attend.getKq_time());
            preparedStatement.setString(3,attend.getKq_1());
            preparedStatement.setString(4,attend.getKq_2());
            preparedStatement.setString(5,attend.getKq_3());
            preparedStatement.setString(6,attend.getKq_4());
            preparedStatement.setString(7,attend.getKq_type());
            preparedStatement.setString(8,attend.getStart_time());
            preparedStatement.setString(9,attend.getStop_time());
            preparedStatement.setFloat(10,attend.getKq_salary());
            int update = preparedStatement.executeUpdate();
            if (update>0){
                flag = true;
                System.out.println("数据入库成功");
            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        // TODO Auto-generated method stub
        return flag;
    }

    @Override
    public boolean deleteAttend(Attend attend) {
        boolean flag = false;
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        try {
            String sql = "delete from attend where kq_id = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, attend.getKq_id());
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
    public boolean updateAttend(int id, Attend attend) {
        boolean flag = false;
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        try {
            String sql = "update attend set kq_time,kq_1,kq_2,kq_3,kq_4,kq_type,start_time,stop_time,kq_salary  where id=?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,attend.getKq_time());
            preparedStatement.setString(2,attend.getKq_1());
            preparedStatement.setString(3,attend.getKq_2());
            preparedStatement.setString(4,attend.getKq_3());
            preparedStatement.setString(5,attend.getKq_4());
            preparedStatement.setString(6,attend.getKq_type());
            preparedStatement.setString(7,attend.getStart_time());
            preparedStatement.setString(8,attend.getStop_time());
            preparedStatement.setFloat(19,attend.getKq_salary());
            preparedStatement.setInt(10,id);
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
    public List<Attend> selectAttend() {
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        List<Attend> list = new ArrayList<Attend>();
        try {
            String sql = "select attend.id, attend.kq_id, attend.kq_time, attend.kq_1, attend.kq_2, attend.kq_3, attend.kq_4, attend.kq_type, attend.start_time, attend.stop_time, attend.kq_salary,user.name,user.department from attend left join user on attend.id = user.id";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Attend a = new Attend();
                a.setId(resultSet.getString("id"));
                a.setKq_id(resultSet.getInt("kq_id"));
                a.setKq_time(resultSet.getString("kq_time"));
                a.setKq_1(resultSet.getString("kq_1"));
                a.setKq_2(resultSet.getString("kq_2"));
                a.setKq_3(resultSet.getString("kq_3"));
                a.setKq_4(resultSet.getString("kq_4"));
                a.setKq_type(resultSet.getString("kq_type"));
                a.setStart_time(resultSet.getString("start_time"));
                a.setStop_time(resultSet.getString("stop_time"));
                a.setKq_salary(resultSet.getFloat("kq_salary"));
                a.setName(resultSet.getString("name"));
                a.setDepartment(resultSet.getString("department"));
                list.add(a);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        System.out.println("显示");
        return list;
    }

    @Override
    public List<Attend> selectOneAttend(Attend attend) {
        DBConnect jdbc = new DBConnect();
        Connection connection = jdbc.getConnection();
        List<Attend> list = new ArrayList<Attend>();
        ResultSet resultSet = null;
        try {
            String sql = "select id, kq_id, kq_time, kq_1, kq_2, kq_3, kq_4, kq_type, start_time, stop_time, kq_salary from attend where  ";
            if("" == attend.getId() || attend.getId().equals("")){
                sql = sql+" 1=1";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                resultSet = preparedStatement.executeQuery();
            }else{
                sql = sql+" id = ?";
                PreparedStatement preparedStatement1 = connection.prepareStatement(sql);
                preparedStatement1.setString(1, attend.getId());
                resultSet = preparedStatement1.executeQuery();
            }
            while(resultSet.next()){
                Attend attend1 = new Attend();
                attend1.setId(resultSet.getString("id"));
                attend1.setKq_id(resultSet.getInt("kq_id"));
                attend1.setKq_time(resultSet.getString("kq_time"));
                attend1.setKq_1(resultSet.getString("kq_1"));
                attend1.setKq_2(resultSet.getString("kq_2"));
                attend1.setKq_3(resultSet.getString("kq_3"));
                attend1.setKq_4(resultSet.getString("kq_4"));
                attend1.setKq_type(resultSet.getString("kq_type"));
                attend1.setStart_time(resultSet.getString("start_time"));
                attend1.setStop_time(resultSet.getString("stop_time"));
                attend1.setKq_salary(resultSet.getFloat("kq_salary"));
                attend1.setName(resultSet.getString("name"));
                attend1.setDepartment(resultSet.getString("department"));
                list.add(attend1);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }
}