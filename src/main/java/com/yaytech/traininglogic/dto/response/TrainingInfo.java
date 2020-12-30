package com.yaytech.traininglogic.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TrainingInfo {

    private String trainingName;
    private String archiveNo;
    private double hour;
}
