package com.yaytech.traininglogic.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PositionId implements Serializable {


    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Dept dept;


    @ManyToOne
    @JoinColumn(name = "title_id")
    private Title title;
}
