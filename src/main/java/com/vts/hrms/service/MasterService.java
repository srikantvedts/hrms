package com.vts.hrms.service;

import com.vts.hrms.dto.DesignationDTO;
import com.vts.hrms.dto.DivisionDTO;
import com.vts.hrms.dto.EmployeeDTO;
import com.vts.hrms.dto.LoginEmployeeDto;
import com.vts.hrms.repository.LoginRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class MasterService {

    private static final Logger log = LoggerFactory.getLogger(MasterService.class);

    @Value("${x_api_key}")
    private String xApiKey;

    private final MasterClientService masterClient;
    private final LoginRepository loginRepository;

    public MasterService(MasterClientService masterClient, LoginRepository loginRepository) {
        this.masterClient = masterClient;
        this.loginRepository = loginRepository;
    }

    public List<DesignationDTO> getEmpDesigMaster() {
        log.info("Fetching designation master");
        return masterClient.getEmpDesigMaster(xApiKey);
    }

    public List<DivisionDTO> getDivisionMaster() {
        log.info("Fetching division master");
        return masterClient.getDivisionMaster(xApiKey);
    }

    public LoginEmployeeDto getEmployeeByUsername(String username) {
        log.info("Fetching employee with username {}", username);

        LoginEmployeeDto dto = loginRepository.findByUserName(username);

        List<EmployeeDTO> employeeList = masterClient.getEmployeeList(xApiKey);

        Map<Long, EmployeeDTO> employeeMap = employeeList.stream()
                .collect(Collectors.toMap(EmployeeDTO::getEmpId, emp -> emp));

        EmployeeDTO employee = employeeMap.get(dto.getEmpId());

        dto.setEmpId(dto.getEmpId());
        dto.setEmpNo(employee.getEmpNo());
        dto.setEmployeeType(employee.getEmployeeType());
        dto.setTitle(employee.getTitle());
        dto.setEmpName(employee.getEmpName());
        dto.setEmpDesigName(employee.getEmpDesigName());
        dto.setEmpStatus(employee.getEmpStatus());
        dto.setRoleName(dto.getRoleName());
        dto.setDivisionId(employee.getDivisionId());
        dto.setLoginId(dto.getLoginId());
        dto.setRoleId(dto.getRoleId());

        return dto;
    }

    public List<EmployeeDTO> getEmployeeList() {
        log.info("Fetching employee master");
        return masterClient.getEmployeeList(xApiKey);
    }
}
