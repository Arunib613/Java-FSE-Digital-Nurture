package com.cognizant.employeemanagement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.employeemanagement.entity.Employee;
import com.cognizant.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Transactional
    public Employee get(int id) {

        return employeeRepository.findById(id).get();

    }

    @Transactional
    public void save(Employee employee) {

        employeeRepository.save(employee);

    }

}
