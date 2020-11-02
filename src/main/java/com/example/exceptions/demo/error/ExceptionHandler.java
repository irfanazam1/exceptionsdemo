package com.example.exceptions.demo.error;

import com.example.exceptions.demo.dto.ErrorDto;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@Order(Ordered.HIGHEST_PRECEDENCE)
@RestControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(HttpStatusException.class)
    public ResponseEntity<ErrorDto> httpStatusException(HttpStatusException exception){
        //Log Exception
        return new ResponseEntity<>(exception.getError(), exception.getError().getHttpStatus());
    }

    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDto> unknownException(Exception exception){
        //Log Exception
        UnknownException unknownException = new UnknownException(exception.getMessage());
        return new ResponseEntity<>(unknownException.getError(), unknownException.getError().getHttpStatus());
    }

}
