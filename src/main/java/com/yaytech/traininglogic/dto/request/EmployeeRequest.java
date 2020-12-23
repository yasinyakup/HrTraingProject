package com.yaytech.traininglogic.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeRequest {
    private String empNo;

    private String fullName;

    private Date hireDate;

    private Date dob;

    private String gender;

    private String dept;

    private String title;
}
