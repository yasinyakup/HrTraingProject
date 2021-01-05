package com.yaytech.traininglogic.service;

import com.yaytech.traininglogic.dto.response.*;
import com.yaytech.traininglogic.model.Employee;
import com.yaytech.traininglogic.model.PersonalTrainingRecord;
import com.yaytech.traininglogic.model.Training;
import com.yaytech.traininglogic.model.TrainingForm;
import com.yaytech.traininglogic.repository.EmployeeRepository;
import com.yaytech.traininglogic.repository.PersonalTrainingRecordRepository;
import com.yaytech.traininglogic.repository.TrainingFormRepository;
import com.yaytech.traininglogic.repository.TrainingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TrainingFormRepository trainingFormRepository;

    @Autowired
    private PersonalTrainingRecordRepository personalTrainingRecordRepository;

    @Autowired
    private TrainingRepository trainingRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);

    }

    public List<EmployeeResponse> getEmployeeByDept(Long deptId){
        return employeeRepository.findAllByDept_Id(deptId).stream()
                .map(this::mapToEmployeeResponse).collect(Collectors.toList());

    }

    public List<EmpTrainingResponse> getEmployeesWithHour(){
        return employeeRepository.findAll().stream().map(employee -> mapToEmpDto(employee)).collect(Collectors.toList());

    }

    public List<EmpTrainingResponse> getEmployeesWithHourNotNull(){
        return employeeRepository.findAll().stream().map(this::mapToEmpDto)
                .filter(empTrainingResponse -> !empTrainingResponse.getTrainingInfos().isEmpty()).collect(Collectors.toList());

    }

    public List<EmpTrainingResponseAsSingle> getAllRecords(){
        return personalTrainingRecordRepository.findAllRecord().stream().map(this::mapToEmpTrainingResponseAsSingle)
                .collect(Collectors.toList());
    }

    public List<EmpTrainingResponseAsSingle> getEmpTrainingResponseAsSingle(){
           return personalTrainingRecordRepository.findAll().stream().map(this::mapToEmpTrainingResponseAsSingle)
                   .collect(Collectors.toList());
    }

    public List<EmpTrainingResponseAsSingle> getEmpTrainingResponseAsSingle2(){
        return personalTrainingRecordRepository.findAllRecord2();
    }

    public EmployeeResponse getEmployee(String empNO){
        Employee employee = employeeRepository.findById(empNO).orElseThrow(
                ()-> new UsernameNotFoundException("Employee not found with id "+empNO)
        );

        return mapToEmployeeResponse(employee);
    }

    public List<EmployeeResponse> getAllEmployees(){
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(this::mapToEmployeeResponse
        ).collect(Collectors.toList());
    }

    private EmployeeResponse mapToEmployeeResponse(Employee employee){
       return EmployeeResponse.builder()
                .empNo(employee.getEmpNo())
                .fullName(employee.getFullName())
                .hireDate(employee.getHireDate())
                .gender(employee.getGender())
                .dob(employee.getDob())
                .dept(employee.getDept().getDeptName())
                .title(employee.getTitle().getTitle())
                .build();

    }

    private EmpTrainingResponseAsSingle mapToEmpTrainingResponseAsSingle(TrainingDto trainingDto){
        Employee employee = employeeRepository.findById(trainingDto.getEmpNo()).orElse(null);
        Training training = trainingRepository.findById(trainingDto.getTrainingNo()).get();

        return EmpTrainingResponseAsSingle.builder()
                .empNo(trainingDto.getEmpNo())
                .fullName(employee.getFullName())
                .dept(employee.getDept().getDeptName())
                .title(employee.getTitle().getTitle())
                .trainingName(training.getName())
                .hour(trainingDto.getHour())
                .build();

    }

    private EmpTrainingResponseAsSingle mapToEmpTrainingResponseAsSingle(PersonalTrainingRecord trainingRecord){
        return EmpTrainingResponseAsSingle.builder()
                .empNo(trainingRecord.getEmployee().getEmpNo())
                .fullName(trainingRecord.getEmployee().getFullName())
                .dept(trainingRecord.getEmployee().getDept().getDeptName())
                .title(trainingRecord.getEmployee().getTitle().getTitle())
                .trainingName(trainingRecord.getTrainingForm().getTraining().getName())
                .archiveNo(trainingRecord.getTrainingForm().getArchiveNo())
                .hour(trainingRecord.getTrainingForm().getHour())
                .build();

    }

    private EmpTrainingResponse mapToEmpDto(Employee employee){
        return
                EmpTrainingResponse.builder().empNo(employee.getEmpNo())
                .fullName(employee.getFullName())
                .dept(employee.getDept().getDeptName())
                .title(employee.getTitle().getTitle())
                .trainingInfos(getTrainingInfo(employee)).build();

    }

    private TrainingInfo getTrainingInfo(TrainingForm trainingForm){
       return TrainingInfo.builder()
                .trainingName(trainingForm.getTraining().getName())
                .archiveNo(trainingForm.getArchiveNo())
                .hour(trainingForm.getHour()).build();
    }

    private List<TrainingInfo> getTrainingInfo(Employee employee){
                return personalTrainingRecordRepository.findPersonalTrainingRecordByEmployee(employee)
                        .stream().map(record->TrainingInfo.builder()
                        .trainingName(record.getTrainingForm().getTraining().getName())
                        .archiveNo(record.getTrainingForm().getArchiveNo())
                        .hour(record.getTrainingForm().getHour()).build())
                        .collect(Collectors.toList());
    }
}
