package com.shnma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description: 部门提供者启动类
 *
 * @author shnma
 * @date 2019/10/4 下午10:09
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class DeptProvider8001App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8001App.class, args);
	}
}
