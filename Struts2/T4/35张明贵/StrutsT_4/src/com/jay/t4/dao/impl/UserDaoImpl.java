package com.jay.t4.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jay.t4.bean.User;
import com.jay.t4.dao.UserDao;
import com.jay.t4.utils.DBManager;


public class UserDaoImpl implements UserDao {
	private Connection con;
	private PreparedStatement ps;

	/*
	 * 
	 * ע��
	 * 
	 * */
	public int addUser (User user) {
		con=DBManager.getConnection();
		String sql="insert into t_user value(?,?,?,?)";
		try {
			ps =con.prepareStatement(sql);
			ps.setString(1, user.getUname());
			ps.setString(2, user.getUpwd());
			ps.setString(3, user.getEducation());
			ps.setLong(4, user.getSex());
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
