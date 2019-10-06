package com.shnma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * description: 部门消费者启动类
 * @author shnma
 * @date 2019/10/4 下午10:09
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.shnma.springcloud"})
public class DeptConsumerFeignApp {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumerFeignApp.class, args);
	}
}
