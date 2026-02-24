package com.vts.hrms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class CalendarDTO implements Serializable {

    private Long calendarId;

    @NotNull(message = "Organizer is required")
    private Long agencyId;
    private String agency;

    @NotBlank(message = "Year is required")
    private String year;

    @NotBlank(message = "Training Name is required")
    private String trainingName;

    private String fileName;
    private MultipartFile file;
    private String createdBy;
    private LocalDateTime createdDate;

}
