package com.captain.rik.demo2.services;


import com.captain.rik.demo2.models.Employee;
import com.captain.rik.demo2.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



public class RobbleGlug implements iEmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        System.out.println("legacy");
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> getEmployeesByFirstName(String firstName) throws Exception {
        throw new NoSuchMethodException();
    }


}
