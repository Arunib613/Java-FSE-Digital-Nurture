package com.cognizant.employeemanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagement.entity.Department;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

        // HQL
        @Query("FROM Department")
        List<Department> getAllDepartments();

        // Native SQL
        @Query(value = "SELECT * FROM department", nativeQuery = true)
        List<Department> getAllDepartmentsNative();
    }

