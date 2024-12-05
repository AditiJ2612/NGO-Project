package com.example.NGOProject.Service;

//import org.springframework.stereotype.Service;

//@Service

import com.example.NGOProject.DTO.EmployeeDTO;
import com.example.NGOProject.DTO.LoginDTO;
import com.example.NGOProject.Response.LoginResponse;

public interface EmployeeService {

    String addEmployee(EmployeeDTO employeeDTO);

    LoginResponse loginEmployee(LoginDTO loginDTO);
}
