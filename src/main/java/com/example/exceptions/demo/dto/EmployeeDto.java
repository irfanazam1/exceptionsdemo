package com.example.exceptions.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.With;

@With
@Data
@AllArgsConstructor
public class EmployeeDto {
    private String id;
    private String name;
}
