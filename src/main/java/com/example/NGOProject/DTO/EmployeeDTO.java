package com.example.NGOProject.DTO;

public class EmployeeDTO {
    private int employee_id;

    private String employeeName;

    private String email;

    private  String password;

    public EmployeeDTO(int employee_id, String employeeName, String email, String password) {
        this.employee_id = employee_id;
        this.employeeName = employeeName;
        this.email = email;
        this.password = password;
    }


    public EmployeeDTO() {
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
        return "EmployeeDTO{" +
                "employee_id=" + employee_id +
                ", employeeName='" + employeeName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
