package com.example.exceptions.demo.error;

import com.example.exceptions.demo.dto.ErrorDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.httpclient.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HttpStatusException extends RuntimeException {
    protected ErrorDto error;
}

