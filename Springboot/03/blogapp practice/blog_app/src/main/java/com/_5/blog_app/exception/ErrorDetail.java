package com._5.blog_app.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorDetail {

    private Date timeStamp;

    private String message;

    private String details;

}
