package com.yaytech.traininglogic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trainer")
public class Trainer {

    @Id
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TrainerType trainerType;
}
