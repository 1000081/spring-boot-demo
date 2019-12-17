package com.employee.demo.service;

import com.employee.demo.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public void save(Employee e);

    public void update (Employee e);

    public void delete(Integer id);

    public Employee getEmployee(Integer id);

    public List<Employee> getEmployees();
}
