package com.example.exceptions.demo.error;

import com.example.exceptions.demo.dto.ErrorDto;
import org.springframework.http.HttpStatus;

public class NoContentFoundException extends HttpStatusException{
    private static final String errorCode = "789";
    public NoContentFoundException(String resource) {
        error = new ErrorDto(errorCode, String.format("No content found for resource: (%s)", resource), HttpStatus.NO_CONTENT);
    }
}
