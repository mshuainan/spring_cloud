package com.shnma.springcloud.dao;

import com.shnma.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * description: 部门dao接口
 * @author shnma
 * @date 2019/10/4  下午8:54
 */
@Mapper
public interface DeptDao {

	/**
	 * description: 添加部门
	 * @param dept
	 * @return boolean
	 * @author shnma
	 * @date 2019/10/4 下午8:57
	 */
	boolean addDept(Dept dept);

	/**
	 * description: 根据id查找部门
	 * @param id
	 * @return com.shnma.springcloud.entities.Dept
	 * @author shnma
	 * @date 2019/10/4 下午8:57
	 */
	Dept findById(Long id);

	/**
	 * description: 获取所有的部门信息
	 * @param
	 * @return java.util.List<com.shnma.springcloud.entities.Dept>
	 * @author shnma
	 * @date 2019/10/4 下午8:57
	 */
	List<Dept> findAll();
}