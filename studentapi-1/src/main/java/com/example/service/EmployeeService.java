package com.example.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
public class EmployeeService {

    private EmployeeRepository repo;

    // Constructor Injection
    public EmployeeService(EmployeeRepository repo) {
        this.repo = repo;
    }

    public List<Employee> getAllEmployees(){
        return repo.findAll();
    }

    public void deleteEmployee(int id){
        repo.deleteById(id);
    }
}