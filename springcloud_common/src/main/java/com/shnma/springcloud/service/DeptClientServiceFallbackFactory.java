package com.shnma.springcloud.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.shnma.springcloud.entities.Dept;

import feign.hystrix.FallbackFactory;

/**
 * description: 服务降级处理
 * @author shnma
 * @date 2019/10/6 下午3:38
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService>
{
	@Override
	public DeptClientService create(Throwable throwable) {
		return new DeptClientService() {
			@Override
			public Dept get(long id)
			{
				return new Dept().setDept_no(id).setDept_name("该ID：" + id + "没有没有对应的信息,Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
						.setDb_source("no this database in MySQL");
			}

			@Override
			public List<Dept> list()
			{
				return null;
			}

			@Override
			public boolean add(Dept dept)
			{
				return false;
			}
		};
	}
}
