package com.yaytech.traininglogic.dto.response;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainingDto {
    private String empNo;

    private String fullName;

    private String trainingNo;

    private String trainingName;

    private double hour;
}
