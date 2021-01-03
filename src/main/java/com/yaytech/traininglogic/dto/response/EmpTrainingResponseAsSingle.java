package com.yaytech.traininglogic.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpTrainingResponseAsSingle {
    private String empNo;

    private String fullName;

    private String dept;

    private String title;

    private String trainingName;

    private String archiveNo;

    private double hour;




}
