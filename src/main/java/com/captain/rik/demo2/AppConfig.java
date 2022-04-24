package com.captain.rik.demo2;

import com.captain.rik.demo2.repositories.EmployeeRepository;
import com.captain.rik.demo2.services.EmployeeServiceRefactored;
import com.captain.rik.demo2.services.RobbleGlug;
import com.captain.rik.demo2.services.iEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Bean
    iEmployeeService employeeControllerEmployeeService(){
        return new RobbleGlug();
    }

    @Bean
    iEmployeeService nameControllerEmployeeService(){
        if ("YES".equals(System.getenv("REFACTOR"))){
            return new EmployeeServiceRefactored(employeeRepository);
        }
        else
        {
            return new RobbleGlug();
        }
    }

}
