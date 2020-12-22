package com.yaytech.traininglogic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_training_required")
public class EmpTrainingRequired implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Dept dept;

    @Id
    @ManyToOne
    @JoinColumn(name = "title_id")
    private Title title;


    @ManyToOne
    @JoinColumn(name = "training_id")
    private Training training;
}
