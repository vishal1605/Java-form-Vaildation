package com.serverValidation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.serverValidation.filter.ValidationFilter;

@Configuration
@Component
public class ValidationConfig implements WebMvcConfigurer {
	
	@Bean
	public ValidationFilter getFilter() {
		return new ValidationFilter();
	}
	
	public void addInterceptors(InterceptorRegistry registry) {
		
		registry.addInterceptor(getFilter()).addPathPatterns("/process");
	}

}
