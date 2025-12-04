package example.JdbcTemplete.payload;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ContactDto {

    private Integer contactId;
    private String name;
    private String mobileNum;
    private String email;
    private String subject;
    private String message;
    private String status;

    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;

}
