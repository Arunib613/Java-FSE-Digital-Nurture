package com.cognizant.employeemanagement.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.employeemanagement.entity.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {

}
