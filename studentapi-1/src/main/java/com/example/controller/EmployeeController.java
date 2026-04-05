package com.example.controller;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.*;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

    private EmployeeService service;

    public EmployeeController(EmployeeService service) {
        this.service = service;
    }

    // Retrieve all employees
    @GetMapping("/employees")
    public List<Employee> getEmployees(){
        return service.getAllEmployees();
    }

    // Group employees by department
    @GetMapping("/employees/group")
    public Map<String, List<Employee>> groupByDepartment(){
        return service.getAllEmployees()
                .stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }

    // Delete employee by empId
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable int id){
        service.deleteEmployee(id);
        return "Employee deleted successfully";
    }
}