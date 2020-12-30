package com.yaytech.traininglogic.dto.response;

import com.yaytech.loginjwt.model.RoleEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmpTrainingResponse {
    private String empNO;

    private String fullName;

    private String dept;

    private String title;

  private List<TrainingInfo> trainingInfos;




}
