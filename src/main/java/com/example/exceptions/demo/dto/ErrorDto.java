package com.example.exceptions.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
@With
public class ErrorDto {
    private String errorCode;
    private String errorMessage;
    private HttpStatus httpStatus;
}
