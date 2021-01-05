package com.yaytech.traininglogic.repository;

import com.yaytech.traininglogic.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

    public List<Employee> findAllByDept_Id(Long deptId);
}
