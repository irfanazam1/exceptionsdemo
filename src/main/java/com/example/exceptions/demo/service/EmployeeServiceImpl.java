package com.example.exceptions.demo.service;

import com.example.exceptions.demo.dto.EmployeeDto;
import com.example.exceptions.demo.error.DuplicateResourceException;
import com.example.exceptions.demo.error.NoContentFoundException;
import com.example.exceptions.demo.error.ResourceNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeServiceImpl implements EmployeeService{

    @Override
    public EmployeeDto findEmployee(String id) {
        throw new ResourceNotFoundException("Employee", id);
    }

    @Override
    public String saveEmployee(EmployeeDto employeeDto) {
        throw new DuplicateResourceException("Employee", employeeDto.getName());
    }

    @Override
    public EmployeeDto updateEmployee(EmployeeDto employeeDto) throws Exception {
        throw new Exception("Runtime Error");
    }

    @Override
    public List<EmployeeDto> findAllEmployees() {
        throw new NoContentFoundException("Employee");
    }

    @Override
    public boolean deleteEmployee(EmployeeDto employeeDto) {
        return false;
    }
}
