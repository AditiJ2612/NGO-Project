package com.example.NGOProject.Entity;

import jakarta.persistence.*;

@Entity
public class Employee {

    @Id
    @Column(name="employee_id",length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employee_id;

    @Column(name = "employee_name",length = 255)
    private String employeeName;

    @Column(name = "email",length = 255)
    private String email;

    @Column(name = "password",length = 255)
    private  String password;

    public Employee(int employee_id, String employeeName, String email, String password) {
        this.employee_id = employee_id;
        this.employeeName = employeeName;
        this.email = email;
        this.password = password;
    }

    public Employee() {
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
