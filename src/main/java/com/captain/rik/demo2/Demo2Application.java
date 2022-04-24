package com.captain.rik.demo2;

import com.captain.rik.demo2.repositories.EmployeeRepository;
import com.captain.rik.demo2.services.EmployeeServiceRefactored;
import com.captain.rik.demo2.services.RobbleGlug;
import com.captain.rik.demo2.services.iEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Demo2Application {

	@Autowired
	private EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Demo2Application.class, args);
		for (String beanName: context.getBeanDefinitionNames()){
			System.out.println(beanName);
		}
	}


}
