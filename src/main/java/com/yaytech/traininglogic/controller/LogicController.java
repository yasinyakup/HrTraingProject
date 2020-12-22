package com.yaytech.traininglogic.controller;

import com.yaytech.traininglogic.model.Dept;
import com.yaytech.traininglogic.model.Employee;
import com.yaytech.traininglogic.repository.DeptRepository;
import com.yaytech.traininglogic.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/logictest")
@AllArgsConstructor
public class LogicController {

    private final DeptRepository deptRepository;
    private final EmployeeRepository employeeRepository;

    @GetMapping("/dept")
    public List<Dept> getAllDept(){
        return deptRepository.findAll();
    }

    @GetMapping("/employee")
    private List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }
}
