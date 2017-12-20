package com.qhit.lh.gr3.xp.t3.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import session.HibernateSessionFactory;

import bean.Emp;

public class DaoImpl implements IDao {

	@Override
	public List getAllList(){
		List list = new ArrayList();

			Session s = HibernateSessionFactory.getSession();
			Transaction tx = s.beginTransaction();
			Query q = s.createQuery("from Emp");
			list =q.list();
			tx.commit();
			s.close();
		return list;
	}

	public List getAllDeptList() {
		List list = new ArrayList();
		
			Session s = HibernateSessionFactory.getSession();
			Transaction tx = s.beginTransaction();
			Query q = s.createQuery("from Dept");
			list =q.list();
			tx.commit();
			s.close();
			
	
		return list;
	}

	public void saveAdd(Emp info) {
		
			Session s = HibernateSessionFactory.getSession();
			Transaction tx = s.beginTransaction();
			s.save(info);
			
			tx.commit();
			s.close();
			
		
	}

	public void todelete(Emp info) {
		
			Session s = HibernateSessionFactory.getSession();
			Transaction tx = s.beginTransaction();
			s.delete(info);
			tx.commit();
			s.close();	
	}

	public Emp getEmpById(Emp info) {
		Emp emp = new Emp();		
		Session s = HibernateSessionFactory.getSession();		
		Transaction tx = s.beginTransaction();			
		emp= (Emp) s.get(Emp.class, info.getEid());			
		tx.commit();			
		s.close();
		return emp;
	}

	public void saveupdate(Emp info) {
	
			Session s = HibernateSessionFactory.getSession();
			Transaction tx = s.beginTransaction();
			s.update(info);
			tx.commit();
			s.close();
			
	}

	

}
