package com.qhit.lh.gr3.hzz.t05.service.ImplUserService;

import java.util.List;

import com.qhit.lh.gr3.hzz.t05.bean.Employee;

public interface IUserService {

	public List userList();
	
	public int addUser(Employee emp);
	
	public int updateUser(Employee emp);
	
	public Employee findUser(int eid);
	
	public int deleteUser(int eid);
	
	
}
