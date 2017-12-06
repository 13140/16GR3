package com.qhit.lh.gr3.hzz.t05.service;

import java.util.List;

import com.qhit.lh.gr3.hzz.t05.bean.Employee;
import com.qhit.lh.gr3.hzz.t05.dao.UserDaoImpl;
import com.qhit.lh.gr3.hzz.t05.dao.ImplUserDao.IUserDao;
import com.qhit.lh.gr3.hzz.t05.service.ImplUserService.IUserService;

public class UserServiceDao implements IUserService {

	IUserDao userDao = new UserDaoImpl();
	
	@Override
	public List userList() {
		return userDao.userList();
	}

	@Override
	public int addUser(Employee emp) {
		return userDao.addUser(emp);
	}

	@Override
	public int updateUser(Employee emp) {
		return userDao.updateUser(emp);
	}

	@Override
	public Employee findUser(int eid) {
		return userDao.findUser(eid);
	}

	@Override
	public int deleteUser(int eid) {
		return userDao.deleteUser(eid);
	}

	
	
}
