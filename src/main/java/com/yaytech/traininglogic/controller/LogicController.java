package com.yaytech.traininglogic.controller;

import com.yaytech.traininglogic.model.Dept;
import com.yaytech.traininglogic.repository.DeptRepository;
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

    @GetMapping("/dept")
    public List<Dept> getAllDept(){
        return deptRepository.findAll();
    }
}
