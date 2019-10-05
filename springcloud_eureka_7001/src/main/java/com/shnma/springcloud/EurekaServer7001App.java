package com.shnma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * description: EurekaServer服务器端启动类,接受其它微服务注册进来
 * @author shnma
 * @date 2019/10/5 下午3:32
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer7001App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7001App.class, args);
	}
}
