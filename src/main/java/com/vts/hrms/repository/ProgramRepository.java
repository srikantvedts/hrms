package com.vts.hrms.repository;

import com.vts.hrms.entity.Program;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgramRepository extends JpaRepository<Program, Long> {
    List<Program> findAllByIsActive(int isActive);
}
