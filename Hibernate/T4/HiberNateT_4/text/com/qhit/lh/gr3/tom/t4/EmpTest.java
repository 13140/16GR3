/**
 * 
 */
package com.qhit.lh.gr3.tom.t4;

import org.junit.Test;

import com.qhit.lh.gr3.jay.t4.bean.Dept;
import com.qhit.lh.gr3.jay.t4.bean.Emp;
import com.qhit.lh.gr3.jay.t4.bean.User;
import com.qhit.lh.gr3.jay.t4.servcie.BaseService;
import com.qhit.lh.gr3.jay.t4.servcie.impl.BaseServiceImpl;

/**
 * @author S01
 * 2017年12月14日
 */
public class EmpTest {
	private BaseService baseService = new BaseServiceImpl();

	@Test
	public void add() {
		//新官上任
		Emp emp = new Emp();
		emp.setEname("刘杰辉");
		emp.setSex("M");
		//账户密码
		User user = new User();
		user.setUname("lwf");
		user.setPassword("123456");
		//部门
		Dept dept = (Dept) baseService.getObjectById(Dept.class, 5);
		
		//1-1
		emp.setUser(user);
		user.setEmp(emp);
		//n-1
		emp.setDept(dept);
		
		baseService.add(emp);
		
	}

}
