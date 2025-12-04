package example.JdbcTemplete.service;

import example.JdbcTemplete.payload.ContactDto;

import java.util.List;

public interface ContactService {
    boolean saveMessagesDetails(ContactDto contactDto);
    List<ContactDto> findMsgsWithOpenStatus();


}
