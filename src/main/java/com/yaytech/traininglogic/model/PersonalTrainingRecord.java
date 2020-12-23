package com.yaytech.traininglogic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "personel_training_records")
public class PersonalTrainingRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "record_id")
    private TrainingForm trainingForm;

    @ManyToOne
    @JoinColumn(name = "emp_tc_no")
    private Employee employee;
}
