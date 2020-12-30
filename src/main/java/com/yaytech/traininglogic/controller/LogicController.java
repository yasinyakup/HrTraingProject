package com.yaytech.traininglogic.controller;

import com.yaytech.loginjwt.model.RoleEnum;
import com.yaytech.traininglogic.dto.request.DeptRequest;
import com.yaytech.traininglogic.dto.response.EmpTrainingResponse;
import com.yaytech.traininglogic.dto.response.EmployeeResponse;
import com.yaytech.traininglogic.model.Dept;
import com.yaytech.traininglogic.model.Employee;
import com.yaytech.traininglogic.repository.DeptRepository;
import com.yaytech.traininglogic.repository.EmployeeRepository;
import com.yaytech.traininglogic.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.HttpResource;

import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/logictest")
@AllArgsConstructor
public class LogicController {

    private final EmployeeService employeeService;
    private final DeptRepository deptRepository;
    private final EmployeeRepository employeeRepository;

    @GetMapping("/dept")
    public List<Dept> getAllDept(){
        return deptRepository.findAll();
    }

    @PostMapping("/newdept")
    public ResponseEntity saveDept(@RequestBody DeptRequest deptRequest){
        Dept dept = Dept.builder().deptName(deptRequest.getName()).build();
        deptRepository.save(dept);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/empwithhour")
    public List<EmpTrainingResponse> getAllEmpWithHour(){
       return employeeService.getEmployeesWithHourNotNull();
    }


    @GetMapping("/employee")
    private List<EmployeeResponse> getAllEmployee(){
        return employeeService.getAllEmployees();
    }
}
