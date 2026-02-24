package com.vts.hrms.repository;

import com.vts.hrms.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

    Role findByRoleId(Long roleId);
    Role  findByRoleName(String roleName);

}

