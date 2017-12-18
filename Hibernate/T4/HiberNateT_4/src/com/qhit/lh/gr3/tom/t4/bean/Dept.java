package com.qhit.lh.gr3.tom.t4.bean;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Dept entity. @author MyEclipse Persistence Tools
 */

public class Dept implements java.io.Serializable {

	// Fields

	private Integer deptId;
	private String dname;

	//1-n
	private Set<Emp> emps = new HashSet<>();
	
	// Constructors


	/** default constructor */
	public Dept() {
	}

	public Set<Emp> getEmps() {
		return emps;
	}

	public void setEmps(Set<Emp> emps) {
		this.emps = emps;
	}

	/** full constructor */
	public Dept(String dname) {
		this.dname = dname;
	}

	// Property accessors

	public Integer getDeptId() {
		return this.deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

}