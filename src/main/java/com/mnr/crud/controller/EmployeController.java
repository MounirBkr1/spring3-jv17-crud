package com.mnr.crud.controller;

import com.mnr.crud.entity.Employee;
import com.mnr.crud.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/save/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/get/employee")
    public List<Employee> getEmployee(){
        return employeeService.getEmployees();

    }

    @GetMapping("/get/employee/{employeeId}")
    public Employee getEmployee(@PathVariable Integer employeeId){
        return employeeService.getEmployees(employeeId);
    }

    @DeleteMapping("/delete/employee/{employeeId}")
    public void deleteEmployee(@PathVariable Integer employeeId){

        employeeService.deleteEmployee(employeeId);
    }

    @PutMapping("update/employee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeService.updateEmployee(employee);
    }
}
