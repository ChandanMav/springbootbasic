package cta.accenture.com.graph.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import cta.accenture.com.graph.filter.MyNewFilter;

@Configuration
public class MyFilterConfig {

	@Bean
	public FilterRegistrationBean<MyNewFilter> registraionBean(){
		FilterRegistrationBean<MyNewFilter> registrationBean = new FilterRegistrationBean<MyNewFilter>();		
		registrationBean.setFilter(new MyNewFilter());
		registrationBean.addUrlPatterns("/persons/*");		
		return registrationBean;
	}
}
