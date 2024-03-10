	package com.in28minutes.myfirstwebapp;

	import org.springframework.boot.SpringApplication;
	import org.springframework.boot.autoconfigure.SpringBootApplication;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.web.servlet.config.annotation.CorsRegistry;
	import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

	@SpringBootApplication
	@Configuration
	public class MyfirstwebappApplication implements WebMvcConfigurer {

		public static void main(String[] args) {
			SpringApplication.run(MyfirstwebappApplication.class, args);
		}
		@Override
		public void addCorsMappings(CorsRegistry registry) {
			registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE");
		}

	}
