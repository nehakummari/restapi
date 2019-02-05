package com.nehak.restapi.controller;


import com.nehak.restapi.model.Employee;
import com.nehak.restapi.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/all")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();

    }

    @GetMapping(value = "/employee/{id}")
    public Employee getId(@PathVariable Integer id) {
        return employeeService.getOne(id);
    }

    @PostMapping("/employee")
    public void saveEmployee(@RequestBody Employee employee) {
        employeeService.save(employee);
    }
    @DeleteMapping("/employee/{id}")
    public List<Employee> deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteById(id);
        return getAllEmployees();
    }

}
