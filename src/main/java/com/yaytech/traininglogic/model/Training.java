package com.yaytech.traininglogic.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "training")
public class Training {
    @Id
    @Column(name = "training_no")
    private String trainingNO;

    private String name;

    @ManyToOne
    @JoinColumn(name = "training_type")
    private TrainerType trainerType;
}
