package com.tkxs.config;

/**
 * @author Mai Thành Duy An
 *
 */
import java.util.UUID;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/webjars/**")//
				.addResourceLocations("/webjars/").resourceChain(false);
		// Access static resource:
		// Ex: http://domain/js/
		registry.addResourceHandler("/js/**") //
				.addResourceLocations("classpath:/static/js/");

		// css
		registry.addResourceHandler("/css/**") //
				.addResourceLocations("classpath:/static/css/");

		// img
		registry.addResourceHandler("/assets/**") //
				.addResourceLocations("classpath:/static/assets/");

		// vendor/font-awesome
		registry.addResourceHandler("/vendor/font-awesome/**") //
				.addResourceLocations("/webjars/font-awesome/5.13.0/");

		// vendor/jquery
		registry.addResourceHandler("/vendor/jquery/**") //
				.addResourceLocations("/webjars/jquery/3.4.1/");

		// vendor/jquery-easing
		registry.addResourceHandler("/vendor/jquery-easing/**") //
				.addResourceLocations("/webjars/jquery-easing/1.4.1/");

		// vendor/bootstrap
		registry.addResourceHandler("/vendor/bootstrap/**") //
				.addResourceLocations("/webjars/bootstrap/4.4.1/");
		
		// vendor/chartjs
		registry.addResourceHandler("/vendor/chart.js/**") //
		.addResourceLocations("/webjars/chart.js/3.4.1/dist/");
		
		// vendor/datatables
		registry.addResourceHandler("/vendor/datatables/**") //
		.addResourceLocations("/webjars/datatables/1.10.25/");

	}

	@Bean
	public ViewResolver jspViewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();

		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/jsp/");
		viewResolver.setSuffix(".jsp");
		viewResolver.setContentType("text/html");
		viewResolver.setOrder(1000);

		return viewResolver;
	}

	@Bean
	public String initTokenRepository() {
		String str = UUID.randomUUID().toString();
		System.out.println("initTokenRepository Bean: " + str);
		return str;
	}
}