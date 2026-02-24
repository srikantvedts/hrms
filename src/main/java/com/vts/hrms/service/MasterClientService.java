package com.vts.hrms.service;

import com.vts.hrms.dto.DesignationDTO;
import com.vts.hrms.dto.DivisionDTO;
import com.vts.hrms.dto.EmployeeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "masterClient", url = "${feign_client_uri}")
public interface MasterClientService {


    @GetMapping("/getEmpDesigMaster")
    List<DesignationDTO> getEmpDesigMaster(@RequestHeader("X-API-KEY") String apiKey);

    @GetMapping("/getDivisionMaster")
    List<DivisionDTO> getDivisionMaster(@RequestHeader("X-API-KEY") String apiKey);

    @GetMapping("/getEmployee")
    List<EmployeeDTO> getEmployeeList(@RequestHeader("X-API-KEY") String apiKey);


    @GetMapping("/getEmployee")
    List<EmployeeDTO> getEmployee(@RequestHeader("X-API-KEY") String apiKey, @RequestParam("empId") long empId);


}
