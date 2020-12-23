package com.yaytech.traininglogic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "training_form")
public class TrainingForm {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "trainingForm")
    List<PersonalTrainingRecord> personalTrainingRecords;

    @ManyToOne
    @JoinColumn(name = "training_no")
    private Training training;

    @ManyToOne
    @JoinColumn(name = "trainer_id")
    private Trainer trainer;

    @Column(name = "archive_no")
    private String archiveNo;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private Section section;

    @Column(name = "man_day")
    private double manDay;

    private Date date;

    private double hour;

    private int attendant;
}
