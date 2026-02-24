package com.vts.hrms.dto;


import lombok.Data;
import java.io.Serializable;

@Data
public class DesignationDTO implements Serializable {

    private Long desigId;
    private int desigSr;
    private String desigCode;
    private String designation;
    private Long desigLimit;
    private String desigCadre;

}
