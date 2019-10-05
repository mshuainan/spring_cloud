package com.shnma.springcloud.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shnma.springcloud.dao.DeptDao;
import com.shnma.springcloud.entities.Dept;
import com.shnma.springcloud.service.DeptService;

/**
 * description: 部门的service实现
 * @author shnma
 * @date 2019/10/5 下午1:47
 */
@Service
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptDao deptDao;

	@Override
	public boolean add(Dept dept) {
		return deptDao.addDept(dept);
	}

	@Override
	public Dept get(Long id) {
		return deptDao.findById(id);
	}

	@Override
	public List<Dept> list() {
		return deptDao.findAll();
	}

}
