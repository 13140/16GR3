package com.qhit.lh.gr3.tom.t2.service.impl;

import java.util.List;

import com.qhit.lh.gr3.tom.t2.dao.BaseDao;
import com.qhit.lh.gr3.tom.t2.dao.impl.BaseDaoImpl;
import com.qhit.lh.gr3.tom.t2.service.BaseService;



/**
 * @author 张明贵
 * TODO
 * 2017年12月13日上午10:15:00
 */
public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = (BaseDao) new BaseDaoImpl();

	@Override
	public void add(Object obj) {
		// TODO Auto-generated method stub
		baseDao.add(obj);
	}

	@Override
	public void delete(Object obj) {
		// TODO Auto-generated method stub
		baseDao.delete(obj);
	}

	@Override
	public void update(Object obj) {
		// TODO Auto-generated method stub
		baseDao.update(obj);
	}

	@Override
	public List<Object> getAll(String fromObject) {
		// TODO Auto-generated method stub
		return baseDao.getAll(fromObject);
	}

	@Override
	public Object getObjectById(Object obj, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(obj, id);
	}

}

