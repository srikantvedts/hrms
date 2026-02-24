package com.vts.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class LoginEmployeeDto {


    private Long empId;
    private String empNo;
    private String employeeType;
    private String title;
    private String empName;
    private String empDesigName;
    private String empStatus;
    private String roleName;
    private Long divisionId;
    private Long loginId;
    private Long roleId;

    public LoginEmployeeDto(Long empId, String empNo, String employeeType, String title, String empName, String empDesigName, String empStatus, String roleName, Long divisionId, Long loginId,Long roleId) {
        this.empId = empId;
        this.empNo = empNo;
        this.employeeType = employeeType;
        this.title = title;
        this.empName = empName;
        this.empDesigName = empDesigName;
        this.empStatus = empStatus;
        this.roleName = roleName;
        this.divisionId = divisionId;
        this.loginId = loginId;
        this.roleId=roleId;
    }
}

