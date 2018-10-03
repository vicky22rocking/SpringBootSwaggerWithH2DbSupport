package com.vikram.bharti.SpringBootRestWithH2.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.bharti.springboot.SpringBootRestWithH2.model.Employee;

public interface EmployeeService extends JpaRepository<Employee, Integer>{
}
