package com.captain.rik.demo2.controllers;

import com.captain.rik.demo2.exceptions.ResourceNotFoundException;
import com.captain.rik.demo2.models.Employee;
import com.captain.rik.demo2.repositories.EmployeeRepository;
import com.captain.rik.demo2.services.iEmployeeService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class NameController {

    private iEmployeeService employeeService;

    private EmployeeRepository employeeRepository;

    public NameController(@Qualifier("EmployeeServiceRefactored") iEmployeeService employeeService, EmployeeRepository employeeRepository){
        this.employeeService = employeeService;
        this.employeeRepository = employeeRepository;
    }



    @GetMapping("/firstNames/{firstName}")
    public List<Employee> getEmployeeById(@PathVariable(value = "firstName") String firstName)
            throws Exception {
        return employeeService.getEmployeesByFirstName(firstName);
    }


}