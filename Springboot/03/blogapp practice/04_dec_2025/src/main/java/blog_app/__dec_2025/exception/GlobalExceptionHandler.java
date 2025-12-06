package blog_app.__dec_2025.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

@ControllerAdvice
public class GlobalExceptionHandler {

    public ResponseEntity<ErrorDetail> resourceNotFoundHandler(
            ResourceNotFoundException ex,
            WebRequest webRequest
    ){
        ErrorDetail errorDetail = new ErrorDetail(
                new Date(),
                ex.getMessage(),
                webRequest.getDescription(true)
        );
        return new ResponseEntity<>(errorDetail, HttpStatus.NOT_FOUND);
    }




    public ResponseEntity<ErrorDetail> genericExceptionHandler(
            Exception ex,
            WebRequest webRequest
    ){
        ErrorDetail errorDetail  = new ErrorDetail(
                new Date(),
                ex.getMessage(),
                webRequest.getDescription(true)
        );
        return new ResponseEntity<>(errorDetail,HttpStatus.NOT_FOUND);
    }

}
