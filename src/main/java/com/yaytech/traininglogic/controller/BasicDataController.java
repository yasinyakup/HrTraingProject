package com.yaytech.traininglogic.controller;

import com.yaytech.traininglogic.model.Dept;
import com.yaytech.traininglogic.model.Title;
import com.yaytech.traininglogic.model.Training;
import com.yaytech.traininglogic.repository.DeptRepository;
import com.yaytech.traininglogic.repository.TitleRepository;
import com.yaytech.traininglogic.repository.TrainingRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/basic")
@AllArgsConstructor
public class BasicDataController {
    private final DeptRepository deptRepository;

    private final TitleRepository titleRepository;

    private final TrainingRepository trainingRepository;

    @GetMapping("/dept")
    public List<Dept> getAllDept(){
        return deptRepository.findAll();
    }

    @GetMapping("/title")
    public List<Title> getAllTitle(){
        return titleRepository.findAll();
    }

    @GetMapping("/training")
    public List<Training> getAllTraining(){
        return trainingRepository.findAll();
    }
}
