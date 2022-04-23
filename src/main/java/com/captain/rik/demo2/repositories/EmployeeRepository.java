package com.captain.rik.demo2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.captain.rik.demo2.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}