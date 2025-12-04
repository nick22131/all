package example.JdbcTemplete.entity;

import lombok.Data;

@Data
public class Contact extends BaseEntity{

    private Integer contactId;
    private String name ;
    private String mobileNum;
    private String email;
    private String message;
    private String status;
    private String subject;

}
