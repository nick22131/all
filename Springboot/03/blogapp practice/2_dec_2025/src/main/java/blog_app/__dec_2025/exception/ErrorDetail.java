package blog_app.__dec_2025.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
public class ErrorDetail{

    private Date timeStamp;
    private String messagse;
    private String details;
}
