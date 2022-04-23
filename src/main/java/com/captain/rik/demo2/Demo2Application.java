package com.captain.rik.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo2Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Demo2Application.class, args);
		for (String beanName: context.getBeanDefinitionNames()){
			System.out.println(beanName);
		}
	}

}
