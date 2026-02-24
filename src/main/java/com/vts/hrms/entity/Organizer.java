package com.vts.hrms.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "hrms_organizer")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Organizer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "organizer_id", nullable = false)
    private Long organizerId;

    @NotNull
    @Column(name = "organizer", nullable = false)
    private String organizer;

    @Size(max = 100)
    @Column(name = "contact_name", length = 100)
    private String contactName;

    @Size(max = 10)
    @Column(name = "phone_no", length = 20)
    private String phoneNo;

    @Size(max = 100)
    @Column(name = "fax_no", length = 100)
    private String faxNo;

    @Size(max = 255)
    @Column(name = "email", length = 255)
    private String email;

    @NotNull
    @Column(name = "is_active", nullable = false)
    private Integer isActive;

    @Size(max = 100)
    @Column(name = "created_by", length = 100)
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Size(max = 100)
    @Column(name = "modified_by", length = 100)
    private String modifiedBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

}
