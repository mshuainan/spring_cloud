package com.shnma.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.shnma.springcloud.entities.Dept;
import com.shnma.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * description: 部门ctrl
 * @author shnma
 * @date 2019/10/5 下午1:54
 */
@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;

	/**
	 * description: 一旦调用服务方法失败并抛出了错误信息后，会自动调用@HystrixCommand标注好的fallbackMethod调用类中的指定方法
	 * @param id
	 * @return com.shnma.springcloud.entities.Dept
	 * @author shnma
	 * @date 2019/10/6 下午3:09
	 */
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod = "processHystrix_Get")
	public Dept get(@PathVariable("id") Long id) {

		Dept dept = this.deptService.get(id);

		if (null == dept) {
			throw new RuntimeException("该ID：" + id + "没有没有对应的信息");
		}

		return dept;
	}

	/**
	 * description: 异常快速响应的方法
	 * @param id
	 * @return com.shnma.springcloud.entities.Dept
	 * @author shnma
	 * @date 2019/10/6 下午3:09
	 */
	public Dept processHystrix_Get(@PathVariable("id") Long id) {
		return new Dept().setDept_no(id).setDept_name("该ID：" + id + "没有没有对应的信息,null--@HystrixCommand")
				.setDb_source("no this database in MySQL");
	}
}
