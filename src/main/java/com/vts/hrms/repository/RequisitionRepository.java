package com.vts.hrms.repository;

import com.vts.hrms.entity.Requisition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequisitionRepository extends JpaRepository<Requisition, Long> {

    List<Requisition> findAllByIsActive(int isActive);
}
