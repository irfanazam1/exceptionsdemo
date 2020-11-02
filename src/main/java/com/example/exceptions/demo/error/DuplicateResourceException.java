package com.example.exceptions.demo.error;

import com.example.exceptions.demo.dto.ErrorDto;
import org.springframework.http.HttpStatus;

public class DuplicateResourceException extends HttpStatusException{
    private static final String errorCode = "456";
    public DuplicateResourceException(String resource, String value) {
        error = new ErrorDto(errorCode, String.format("Resource: (%s) with value: (%s) already exists ", resource, value), HttpStatus.BAD_REQUEST );
    }
}
