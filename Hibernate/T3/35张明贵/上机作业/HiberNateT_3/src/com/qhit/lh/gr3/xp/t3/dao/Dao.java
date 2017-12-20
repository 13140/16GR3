package com.qhit.lh.gr3.xp.t3.dao;

import java.util.List;


import bean.Emp;

public interface IDao {

	
	public List getAllList();
	public List getAllDeptList();
	public void saveAdd(Emp info);
	public void todelete(Emp info);
	public Emp getEmpById(Emp info);
	public void saveupdate(Emp info);
	
}