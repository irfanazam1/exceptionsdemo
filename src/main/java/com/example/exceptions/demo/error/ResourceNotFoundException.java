package com.example.exceptions.demo.error;

import com.example.exceptions.demo.dto.ErrorDto;
import org.springframework.http.HttpStatus;

public class ResourceNotFoundException extends HttpStatusException{
    private static final String errorCode = "123";
    public ResourceNotFoundException(String resource, String id) {
        error = new ErrorDto(errorCode, String.format("Resource: (%s) with id: (%s) was not found ", resource, id), HttpStatus.NOT_FOUND );
    }

}
