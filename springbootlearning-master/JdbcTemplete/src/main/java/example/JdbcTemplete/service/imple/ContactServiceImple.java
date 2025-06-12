package example.JdbcTemplete.service.imple;

import example.JdbcTemplete.Constants.Constants;
import example.JdbcTemplete.Repository.ContactRepository;
import example.JdbcTemplete.entity.Contact;
import example.JdbcTemplete.payload.ContactDto;
import example.JdbcTemplete.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor


public class ContactServiceImple implements ContactService {
    private final ContactRepository contactRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<ContactDto> findMsgsWithOpenStatus() {
     List<Contact> contactMsgs = contactRepository.findMsgsWithStatus(Constants.OPEN);

        return contactMsgs.parallelStream()
                .map(contact -> modelMapper.map(contact, ContactDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public boolean saveMessagesDetails(ContactDto contactDto){
        boolean isSaved = false;
        Contact contact = modelMapper.map(contactDto, Contact.class);
        contact.setStatus(Constants.OPEN);
        contact.setCreatedBy(Constants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        int result = contactRepository.saveContactMsg(contact);
        if(result > 0 ){
            isSaved = true;
        }
        return isSaved;

    }

}
