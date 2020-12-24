package com.yaytech.traininglogic.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainingRecordRequest {
    private String TrainingName;

    private String TrainerName;

    private String sectionName;

    private Date trainingDate;

    private double trainingHour;

    private List<EmployeeRequest> attendedEmployees;

}
