package com.example.exceptions.demo.error;

import com.example.exceptions.demo.dto.ErrorDto;
import org.springframework.http.HttpStatus;

public class UnknownException extends HttpStatusException {
    private static final String errorCode = "112233";
    public UnknownException(String message) {
        error = new ErrorDto(errorCode, String.format("Unknown error occurred: %s", message), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
