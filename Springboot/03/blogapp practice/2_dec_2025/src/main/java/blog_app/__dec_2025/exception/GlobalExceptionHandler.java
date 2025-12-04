package blog_app.__dec_2025.exception;

import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

     public ResponseEntity<ErrorDetail> resourceNotFoundHandler(
             ResourceNotFoundException exception,
             WebRequest webRequest
     ){
         ErrorDetail errorDetail = new ErrorDetail(
                 new Date(),
                 exception.getMessage(),
                 webRequest.getDescription(true)
         );

         return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
     }




     public ResponseEntity<ErrorDetail> genericExceptionHandler(
             Exception exception,
             WebRequest webRequest
     ){
         ErrorDetail errorDetail = new ErrorDetail(
                 new Date(),
                 exception.getMessage(),
                 webRequest.getDescription(true)
         );

         return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND      );
     }
}
