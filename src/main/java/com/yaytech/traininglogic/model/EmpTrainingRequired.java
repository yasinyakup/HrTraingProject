package com.yaytech.traininglogic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_training_required")
public class EmpTrainingRequired {

    @Id
    @Column(name = "dept_id")
    @JoinColumn(name = "id")
    @ManyToOne
    private Dept dept;

    @Id
    @Column(name = "title_id")
    @ManyToOne
    @JoinColumn(name = "id")
    private Title title;

    @Column(name = "training_id")
    @ManyToOne
    @JoinColumn(name = "trainingNO")
    private Training training;
}
