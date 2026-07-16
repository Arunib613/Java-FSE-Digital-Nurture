package com.cognizant.employeemanagement;

import com.cognizant.employeemanagement.entity.Department;
import com.cognizant.employeemanagement.entity.Employee;
import com.cognizant.employeemanagement.service.DepartmentService;
import com.cognizant.employeemanagement.service.EmployeeService;
import com.cognizant.employeemanagement.service.SkillService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EmployeeManagementApplication {
    private static EmployeeService employeeService;
    private static DepartmentService departmentService;
    private static SkillService skillService;

    public static void main(String[] args) {


        ConfigurableApplicationContext context =
                SpringApplication.run(EmployeeManagementApplication.class, args);

        employeeService = context.getBean(EmployeeService.class);
        departmentService = context.getBean(DepartmentService.class);
        skillService = context.getBean(SkillService.class);

        testGetEmployee();
        testGetDepartment();

    }


    private static void testGetDepartment() {

        Department department = departmentService.get(1);

        System.out.println("Department : " + department.getName());

        for (Employee employee : department.getEmployeeList()) {
            System.out.println(employee.getName());
        }

    }
    private static void testGetEmployee() {

        Employee employee = employeeService.get(1);

        System.out.println(employee);

        System.out.println(employee.getDepartment());

    }
}


