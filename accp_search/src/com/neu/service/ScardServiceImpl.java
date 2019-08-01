package com.neu.service;

import java.util.List;

import com.neu.dao.ScardDao;
import com.neu.dao.ScardDaoImpl;
import com.neu.entity.ScardInfo;

public class ScardServiceImpl implements ScardService {
	ScardDao dao=new ScardDaoImpl();
	@Override
	public List<ScardInfo> getAll() throws Exception {
		List<ScardInfo> scardInfo = dao.getAll();
		return scardInfo;
	}

}
