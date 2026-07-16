package com.cognizant.employeemanagement.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.employeemanagement.entity.Department;
import com.cognizant.employeemanagement.repository.DepartmentRepository;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public Department get(int id) {

        return departmentRepository.findById(id).get();

    }

    @Transactional
    public void save(Department department) {

        departmentRepository.save(department);

    }

}
