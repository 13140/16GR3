/**
 * 
 */
package com.qhit.lh.gr3.tom.hb;

import static org.junit.Assert.*;


import org.junit.Test;

import com.qhit.lh.gr3.tom.hb.bean.Dept;
import com.qhit.lh.gr3.tom.hb.bean.User;
import com.qhit.lh.gr3.tom.hb.servcie.BaseService;
import com.qhit.lh.gr3.tom.hb.servcie.impl.BaseServiceImpl;

/**
 * @author tom
 *TODO
 * 2017年12月14日下午5:42:34
 */
public class Deptdelete {
	private BaseService baseser = new BaseServiceImpl();
	@Test
	public void delete() {
		Dept dept = new Dept();
		dept	= (Dept) baseser.getObjectById(dept, 2);
		baseser.delete(dept);
	}
	@Test
	public void deleteuser(){
		User user = new User();
		user = (User) baseser.getObjectById(user,1010);
		baseser.delete(user);
	}

}
