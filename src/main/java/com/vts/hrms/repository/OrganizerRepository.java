package com.vts.hrms.repository;

import com.vts.hrms.entity.Organizer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrganizerRepository extends JpaRepository<Organizer, Long> {
    List<Organizer> findAllByIsActive(int isActive);
}
