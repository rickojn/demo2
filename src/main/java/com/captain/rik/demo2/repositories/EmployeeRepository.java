package com.captain.rik.demo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.captain.rik.demo2.models.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{


    List<Employee> findByFirstName(String firstName);
}