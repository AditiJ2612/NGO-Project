package com.example.NGOProject.Repository;

import com.example.NGOProject.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    Optional<Employee> findOneByEmailAndPassword(String email, String password);

    Employee findByEmail(String Email);
}
