package com.yaytech.traininglogic.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @Column(name = "emp_tc_no")
    private String empNo;

    @Column(name = "full_name")
    private String fullName;

    @Column(name = "hire_date")
    private Date hireDate;

    private Date dob;

    private String gender;


    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Dept dept;


    @ManyToOne
    @JoinColumn(name = "title_id")
    private Title title;


}
