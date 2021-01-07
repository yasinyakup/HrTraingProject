package com.yaytech.traininglogic.dto.response;

import com.yaytech.traininglogic.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpTrainingResponseAsSingledto {
    private Employee employee;

    private String trainingNo;

    private String trainingName;

    private double hour;




}
