package com.vts.hrms.repository;

import com.vts.hrms.entity.Calendar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CalenderRepository extends JpaRepository<Calendar, Long> {

    List<Calendar> findAllByYearAndIsActive(String year, int isActive);
}
