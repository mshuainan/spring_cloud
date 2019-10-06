package com.shnma.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author : mashuainan
 * create at:  2019/10/5  下午2:30
 * @description: 配置bean
 */
@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}

	@Bean
	public IRule myRule(){
		//用重新选择的随机算法替代默认的轮询
		//return new RandomRule();
		return new RetryRule();
	}
}