package com.example.exceptions.demo.controller;

import ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import com.example.exceptions.demo.dto.EmployeeDto;
import com.example.exceptions.demo.error.HttpStatusException;
import com.example.exceptions.demo.error.ResourceNotFoundException;
import com.example.exceptions.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.lang.annotation.Retention;
import java.util.List;

@RestController
@RequestMapping("/api/exceptionsdemo")
public class ExceptionsDemoController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employee/{id}")
    public ResponseEntity<EmployeeDto> findEmployee(@PathVariable(value = "id") String id){
        return ResponseEntity.ok(employeeService.findEmployee(id));
    }

    @GetMapping(value = "/employee")
    public ResponseEntity<List<EmployeeDto>> findEmployees(){
        return ResponseEntity.ok(employeeService.findAllEmployees());
    }

    @PostMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> saveEmployee(@RequestBody EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.saveEmployee(employeeDto));
    }

    @PutMapping(value = "/employee", consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<EmployeeDto> updateEmployee(@RequestBody EmployeeDto employeeDto) throws Exception{
        return ResponseEntity.ok(employeeService.updateEmployee(employeeDto));
    }
}
