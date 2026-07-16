package com.cognizant.employeemanagement;

import com.cognizant.employeemanagement.repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeManagementApplicationTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testHQL() {

        System.out.println("===== HQL =====");

        employeeRepository.getAllEmployees()
                .forEach(System.out::println);
    }

    @Test
    public void testNativeQuery() {

        System.out.println("===== Native Query =====");

        employeeRepository.getAllEmployeesNative()
                .forEach(System.out::println);
    }

}
