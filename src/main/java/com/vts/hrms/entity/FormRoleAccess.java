package com.vts.hrms.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
@Entity
@Table(name="hrms_form_role_access")
@Data
public class FormRoleAccess {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "form_role_access_id")
    private Long formRoleAccessId ;

    @Column(name = "role_id")
    private Long roleId ;

    @Column(name = "form_detail_id")
    private Long formDetailId ;

    @Column(name = "for_view")
    private String ForView ;

    @Column(name = "for_add")
    private String ForAdd ;

    @Column(name = "for_edit")
    private String ForEdit ;

    @Column(name = "for_delete")
    private String ForDelete ;

    @Column(name = "is_active")
    private int isActive ;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "modified_by")
    private String modifiedBy;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;
}
