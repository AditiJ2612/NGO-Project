package com.example.NGOProject.Service.Implementation;

import com.example.NGOProject.DTO.EmployeeDTO;
import com.example.NGOProject.DTO.LoginDTO;
import com.example.NGOProject.Entity.Employee;
import com.example.NGOProject.Repository.EmployeeRepo;
import com.example.NGOProject.Response.LoginResponse;
import com.example.NGOProject.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service

public class EmployeeImpl implements EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;


    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee(
                employeeDTO.getEmployee_id(),
                employeeDTO.getEmployeeName(),
                employeeDTO.getEmail(),

                this.passwordEncoder.encode(employeeDTO.getPassword())
        );

        employeeRepo.save(employee);
        return employee.getEmployeeName();
    }

    public LoginResponse loginEmployee(LoginDTO loginDTO) {
        Employee employee = employeeRepo.findByEmail(loginDTO.getEmail());
        if (employee != null) {
            String encodedPassword = employee.getPassword();
            Boolean isRight = passwordEncoder.matches(loginDTO.getPassword(), encodedPassword);
            if (isRight) {
                return new LoginResponse("Login Success", true);
            } else {
                return new LoginResponse("Incorrect password", false);
            }
        } else {
            return new LoginResponse("Email does not exist", false);
        }
    }

}
