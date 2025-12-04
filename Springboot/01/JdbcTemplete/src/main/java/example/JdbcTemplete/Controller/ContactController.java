package example.JdbcTemplete.Controller;

import example.JdbcTemplete.payload.ContactDto;
import example.JdbcTemplete.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contact")
@RequiredArgsConstructor

public class ContactController {
    private final ContactService contactService;


    @PostMapping("/save")
    public ResponseEntity<String> saveMessage(@RequestBody ContactDto contactDto){
        boolean isSaved = contactService.saveMessagesDetails(contactDto);
        if(isSaved){
            return ResponseEntity.status(HttpStatus.CREATED).body("Message saved successfully");
        }else{
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Failed to save Message");
        }
    }

    @GetMapping("/openMessages")
    public ResponseEntity<List<ContactDto>> displayOpenMessages(){
        List<ContactDto> contactMsgs = contactService.findMsgsWithOpenStatus();
        if(contactMsgs.isEmpty()){
            return ResponseEntity.noContent().build();

        }
        return ResponseEntity.ok(contactMsgs);
    }
}
