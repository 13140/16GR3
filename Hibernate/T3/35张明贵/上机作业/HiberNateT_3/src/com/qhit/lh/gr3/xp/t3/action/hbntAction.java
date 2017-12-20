package com.qhit.lh.gr3.xp.t3.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.struts.ActionSupport;

import com.qhit.lh.gr3.xp.t3.bean.Emp;
import com.qhit.lh.gr3.xp.t3.dao.impl.DaoImpl;



public class hbntAction extends ActionSupport{

	private List list = new ArrayList();
	private DaoImpl dao = new DaoImpl();
	private Emp info;
	public List getList() {
		return list;
	}
	public void setList(List list) {
		this.list = list;
	}
	public Emp getInfo() {
		return info;
	}
	public void setInfo(Emp info) {
		this.info = info;
	}
	
	public String toupdate()throws Exception{
			
		info= dao.getEmpById(info);	
		list = dao.getAllDeptList();

		return "update";
	}
	
	public String saveupdate()throws Exception{
			
		dao.saveupdate(info);
			
		return "tolist";
		
	}
	
	
	public String todelete() throws Exception{
	
			dao.todelete(info);

		return "tolist";
	}
	
	public String getAllList() throws Exception{
		try {
			list = dao.getAllList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "list";
	}
	
	
	public String toAdd() throws Exception{
	
			list = dao.getAllDeptList();

		return "add";
	}
	
	public String saveadd() throws Exception{
	
			dao.saveAdd(info);

		return "tolist";
	}
}
