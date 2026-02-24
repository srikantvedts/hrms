package com.vts.hrms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class RoleDTO {

    @NotNull(message = "Role id is required")
    private Long roleId;

    @NotBlank(message = "Role name is required")
    private String roleName;

}
