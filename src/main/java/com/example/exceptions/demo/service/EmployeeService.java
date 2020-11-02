package com.example.exceptions.demo.service;

import com.example.exceptions.demo.dto.EmployeeDto;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface EmployeeService {
    EmployeeDto findEmployee(String id);
    String saveEmployee(EmployeeDto employeeDto);
    EmployeeDto updateEmployee(EmployeeDto employeeDto) throws Exception;
    List<EmployeeDto> findAllEmployees();
    boolean deleteEmployee(EmployeeDto employeeDto);

}
