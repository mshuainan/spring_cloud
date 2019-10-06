package com.shnma.springcloud.controller;

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
	@Autowired
	private DiscoveryClient discoveryClient;

	/**
	 * description: 新增部门
	 * @param dept
	 * @return boolean
	 * @author shnma
	 * @date 2019/10/5 下午1:55
	 */
	@RequestMapping(value = "/dept/add", method = RequestMethod.POST)
	public boolean add(@RequestBody Dept dept) {
		return deptService.add(dept);
	}

	/**
	 * description:根据id获取部门
	 * @param id
	 * @return com.shnma.springcloud.entities.Dept
	 * @author shnma
	 * @date 2019/10/5 下午1:55
	 */
	@RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
	public Dept get(@PathVariable("id") Long id) {
		return deptService.get(id);
	}

	/**
	 * description:获取所有的部门
	 * @param
	 * @return java.util.List<com.shnma.springcloud.entities.Dept>
	 * @author shnma
	 * @date 2019/10/5 下午1:55
	 */
	@RequestMapping(value = "/dept/list", method = RequestMethod.GET)
	public List<Dept> list() {
		return deptService.list();
	}

	/**
	 * description:获取服务的信息（SPRINGCLOUD-DEPT）
	 * @param
	 * @return java.lang.Object
	 * @author shnma
	 * @date 2019/10/5 下午5:56
	 */
	@RequestMapping(value = "/dept/discovery", method = RequestMethod.GET)
	public Object discovery() {
		List<String> list = discoveryClient.getServices();
		System.out.println("**********" + list);

		List<ServiceInstance> srvList = discoveryClient.getInstances("SPRINGCLOUD-DEPT");
		for (ServiceInstance element : srvList) {
			System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
					+ element.getUri());
		}
		return this.discoveryClient;
	}
}
