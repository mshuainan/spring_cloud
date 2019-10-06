package com.shnma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * description: 部门提供者启动类
 * @author shnma
 * @date 2019/10/4 下午10:09
 */
@SpringBootApplication
@EnableEurekaClient //本服务启动后会自动注册进eureka服务中
@EnableDiscoveryClient //服务发现
@EnableCircuitBreaker //对hystrixR熔断机制的支持
public class DeptProviderHystrix8001App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProviderHystrix8001App.class, args);
	}
}
