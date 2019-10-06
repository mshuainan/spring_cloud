package com.shnma.springcloud;

import com.shnma.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * description: 部门消费者启动类
 * @author shnma
 * @date 2019/10/4 下午10:09
 */
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "SPRINGCLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumer9000App {
	public static void main(String[] args) {
		SpringApplication.run(DeptConsumer9000App.class, args);
	}
}
