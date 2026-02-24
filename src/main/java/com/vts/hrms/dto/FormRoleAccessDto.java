package com.vts.hrms.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormRoleAccessDto {

    private Long formRoleAccessId;
    private String formDispName;
    private boolean forView;
    private boolean forAdd;
    private boolean forEdit;
    private boolean forDelete;
    private Long formDetailId;
    private Long moduleId;
    private boolean isActive;
    private Long roleId;
    private Long formModuleId;
}
