package com.example.spring_boot_ex10_JPA_basic.exception;

import org.springframework.http.HttpStatus;

public class BlogAPIException extends RuntimeException {
    private HttpStatus status;
    private String message;

    public BlogAPIException(HttpStatus status, String message ) {
        this.status = status;
        this.message = message;
    }

    public BlogAPIException (String message , HttpStatus status, String message1) {
        super(message);
        this.status = status ;
        this.message = message1 ;
    }

    public HttpStatus getStatus(){
        return status;
    }
}
