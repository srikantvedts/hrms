package com.vts.hrms.dto;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ReportRequestDTO {

    private List<String> fields;

    private List<ExcelFieldDTO> excelFields;
}
