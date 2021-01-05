package com.yaytech.traininglogic.dto.request;

import com.yaytech.traininglogic.model.Dept;
import com.yaytech.traininglogic.model.Title;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeRequest {
    private String empNo;

    private String fullName;

    private Date hireDate;

    private Date dob;

    private String gender;

    private Dept dept;

    private Title title;
}
