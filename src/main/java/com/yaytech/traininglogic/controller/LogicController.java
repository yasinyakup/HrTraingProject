package com.yaytech.traininglogic.controller;

import com.yaytech.loginjwt.model.RoleEnum;
import com.yaytech.traininglogic.dto.request.DeptRequest;
import com.yaytech.traininglogic.dto.request.EmployeeRequest;
import com.yaytech.traininglogic.dto.response.EmpTrainingResponse;
import com.yaytech.traininglogic.dto.response.EmpTrainingResponseAsSingle;
import com.yaytech.traininglogic.dto.response.EmployeeResponse;
import com.yaytech.traininglogic.dto.response.TrainingDto;
import com.yaytech.traininglogic.model.Dept;
import com.yaytech.traininglogic.model.Employee;
import com.yaytech.traininglogic.repository.DeptRepository;
import com.yaytech.traininglogic.repository.EmployeeRepository;
import com.yaytech.traininglogic.repository.PersonalTrainingRecordRepository;
import com.yaytech.traininglogic.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
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
    private final PersonalTrainingRecordRepository personalTrainingRecordRepository;




    @PostMapping("/newdept")
    public ResponseEntity saveDept(@RequestBody DeptRequest deptRequest){
        Dept dept = Dept.builder().deptName(deptRequest.getName()).build();
        deptRepository.save(dept);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/empwithhour")
    public List<EmpTrainingResponseAsSingle> getAllEmpWithHour(){
       return employeeService.getEmpTrainingResponseAsSingle();
    }


    @GetMapping("/employees")
    public List<EmployeeResponse> getAllEmployee(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public EmployeeResponse getEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);
    }


    @GetMapping("/employees-single")
    public List<EmpTrainingResponseAsSingle> getAllrecord(){
        return employeeService.getAllRecords();
    }
    @GetMapping("/trainings")
    public List<TrainingDto> getAllrecordWithoutArchiveNo(){
        return personalTrainingRecordRepository.findAllRecord();
    }

    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        System.out.println(employee);

        return employeeService.saveEmployee(employee);
    }

    @GetMapping("/employees/dept/{id}")
    public List<EmployeeResponse> getAllEmployeeByDept(@PathVariable long id){
        return employeeService.getEmployeeByDept(id);
    }

    @GetMapping("/employees-single2")
    public List<EmpTrainingResponseAsSingle> getAllrecord2(){
        return employeeService.getEmpTrainingResponseAsSingle2();
    }





}
