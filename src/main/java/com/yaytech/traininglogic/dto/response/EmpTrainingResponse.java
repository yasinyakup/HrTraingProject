package com.yaytech.traininglogic.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpTrainingResponse {
    private String empNO;

    private String fullName;

    private String dept;

    private String title;

    private String trainingNO;

    private String archiveNo;

    private double hour;


}
