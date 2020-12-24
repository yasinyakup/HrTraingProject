package com.yaytech.traininglogic.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_training_required")
public class EmpTrainingRequired implements Serializable {


    @EmbeddedId
    private PositionId positionId;


    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;
}
