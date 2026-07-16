package com.cognizant.employeemanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagement.entity.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

        // HQL
        @Query("FROM Employee")
        List<Employee> getAllEmployees();

        @Query("FROM Employee e WHERE e.salary > :salary")
        List<Employee> findSalaryGreaterThan(@Param("salary") double salary);

        // Native SQL
        @Query(value = "SELECT * FROM employee", nativeQuery = true)
        List<Employee> getAllEmployeesNative();

        @Query(value = "SELECT * FROM employee WHERE em_salary > :salary", nativeQuery = true)
        List<Employee> getSalaryGreaterNative(@Param("salary") double salary);


    }

