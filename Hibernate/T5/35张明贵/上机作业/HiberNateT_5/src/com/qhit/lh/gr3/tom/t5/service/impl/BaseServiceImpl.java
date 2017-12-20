package com.qhit.lh.gr3.tom.t5.service.impl;

import java.util.List;



public class BaseServiceImpl implements com.qhit.lh.gr3.tom.t5.service.BaseService {
	private com.qhit.lh.gr3.tom.t5.dao.impl.BaseDaoImpl baseDao = new com.qhit.lh.gr3.tom.t5.dao.impl.BaseDaoImpl();
	public void add(Object obj) {
		baseDao.add(obj);
	}

	public void delete(Object obj) {
		baseDao.delete(obj);
	}

	public void update(Object obj) {
		baseDao.update(obj);
	}

	public List<Object> queryAll(String tableName) {
		return baseDao.queryAll(tableName);
	}

	@Override
	public Object getObjectById(Class clazz, int id) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(clazz, id);
	}

}
