package com.example.entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    private int empId;

    private String empName;
    private String role;
    private String department;

    public Employee() {}

    public Employee(int empId, String empName, String role, String department) {
        this.empId = empId;
        this.empName = empName;
        this.role = role;
        this.department = department;
    }

    public int getEmpId() { return empId; }
    public void setEmpId(int empId) { this.empId = empId; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
}