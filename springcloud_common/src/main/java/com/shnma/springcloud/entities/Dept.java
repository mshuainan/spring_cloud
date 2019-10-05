package com.shnma.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author : mashuainan
 * create at:  2019/10/3  下午9:41
 * @description: 部门POJO
 */
@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Dept {

	/**
	 * 部门编号
	 */
	private long dept_no;

	/**
	 * 部门名称
	 */
	private  String dept_name;

	/**
	 * 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	 */
	private String db_source;

//	public Dept(String deptName) {
//		this.deptName = deptName;
//	}
}