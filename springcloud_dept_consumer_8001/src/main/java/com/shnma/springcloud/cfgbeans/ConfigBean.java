package com.shnma.springcloud.cfgbeans;

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
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}