package com.employee.demo.service;

import com.employee.demo.dao.EmployeeRepository;
import com.employee.demo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public void save(Employee e) {
        employeeRepository.save(e);
    }

    @Override
    public void update(Employee e) {
        employeeRepository.save(e);
    }

    @Override
    public void delete(Integer id) {
        Employee e = new Employee();
        e.setEmployeeId(id);
        employeeRepository.delete( e);
    }

    @Override
    public Employee getEmployee(Integer id) {
        return employeeRepository.getOne(id);
    }

    @Override
    public List<Employee> getEmployees() {
        return employeeRepository.findAll();
    }
}
