package com.shnma.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptProviderDashBoardApp
{
	public static void main(String[] args)
	{
		SpringApplication.run(DeptProviderDashBoardApp.class, args);
	}
}
