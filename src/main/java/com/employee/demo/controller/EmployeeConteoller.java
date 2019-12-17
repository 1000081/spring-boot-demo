package com.employee.demo.controller;

import com.employee.demo.entity.Employee;
import com.employee.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeConteoller {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public ResponseEntity<List<Employee>> getEmployees(){
        return ResponseEntity.ok().body(employeeService.getEmployees());
    }

    @GetMapping("/{id}")
    public ResponseEntity <Employee> getEmployee( @PathVariable("id") int id){
        return ResponseEntity.ok().body(employeeService.getEmployee(id));
    }

    @PostMapping
    public void save(Employee employee){
        employeeService.save(employee);
    }
}