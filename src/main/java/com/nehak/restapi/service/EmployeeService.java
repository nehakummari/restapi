package com.nehak.restapi.service;

import com.nehak.restapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeService  extends JpaRepository<Employee, Integer> {
}
