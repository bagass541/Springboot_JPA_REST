package com.bagas.springboot.spring_data_rest.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.bagas.springboot.spring_data_rest.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
