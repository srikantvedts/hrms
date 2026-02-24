package com.vts.hrms.projection;

public interface EmployeeProjection {

    Long getEmpId();
    String getEmpCode();
    String getEmployeeType();
    String getTitle();
    String getFullName();
    String getDesignationName();
    String getDivisionCode();
    String getStatusName();
    String getRoleName();
    Long getDivisionId();
    Long getLoginId();
}