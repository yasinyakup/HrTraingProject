package com.yaytech.traininglogic.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeResponse {

    private String empNo;

    private String fullName;

    private Date hireDate;

    private Date dob;

    private String gender;

    private String dept;

    private String title;

}
