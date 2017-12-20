package com.qhit.lh.gr3.tom.t4.bean;

/**
 * Emp entity. @author MyEclipse Persistence Tools
 */

public class Emp implements java.io.Serializable {

	// Fields

	private Integer eid;
	private String ename;
	private String sex;
	private Integer deptId;
	
	//一对一
	private User user;
	//n-1
	private Dept dept;

	// Constructors

	/** default constructor */
	public Emp() {
	}

	/** minimal constructor */
	public Emp(String ename, String sex) {
		this.ename = ename;
		this.sex = sex;
	}

	/** full constructor */
	public Emp(String ename, String sex, Integer deptId) {
		this.ename = ename;
		this.sex = sex;
		this.deptId = deptId;
	}

	// Property accessors

	public Integer getEid() {
		return this.eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

}