package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
