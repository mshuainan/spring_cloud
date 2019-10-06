package com.shnma.springcloud.service;

import com.shnma.springcloud.entities.Dept;

import java.util.List;

/**
 * description: 部门service
 * @author shnma
 * @date 2019/10/5 下午1:46
 */
public interface DeptService {

	/**
	 * description: 新增部门
	 * @param dept
	 * @return boolean
	 * @author shnma
	 * @date 2019/10/5 下午1:46
	 */
	boolean add(Dept dept);

	/**
	 * description:根据部门id获取部门信息
	 * @param id
	 * @return com.shnma.springcloud.entities.Dept
	 * @author shnma
	 * @date 2019/10/5 下午1:47
	 */
	Dept get(Long id);

	/**
	 * description: 获取所有的部门信息
	 * @param
	 * @return java.util.List<com.shnma.springcloud.entities.Dept>
	 * @author shnma
	 * @date 2019/10/5 下午1:47
	 */
	List<Dept> list();
}
