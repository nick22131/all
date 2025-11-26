package com._5.blog_app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(ResourceNotFoundException.class)
    ResponseEntity<ErrorDetail> resourceNotFoundExceptionHandler(
            ResourceNotFoundException exception,
            WebRequest webRequest
    ){
        ErrorDetail errorDetail = new ErrorDetail(
                new Date(),
                exception.getMessage(),
                webRequest.getDescription(true)
        );
        return new ResponseEntity(errorDetail, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    ResponseEntity<ErrorDetail> genericExceptionHandler(
            Exception ex,
            WebRequest webRequest
    ){
        ErrorDetail errorDetail = new ErrorDetail(
                new Date(),
                ex.getMessage(),
                webRequest.getDescription(true)
        );

        return new ResponseEntity(errorDetail,HttpStatus.NOT_FOUND);
    }


}
