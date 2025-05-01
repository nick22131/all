package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.payload.StudentDTO;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")

public class StudentController {
   private final StudentService studentService;

    @GetMapping("/get-all")
    public ResponseEntity<List<StudentDTO>> getAllStudents (){
        List<StudentDTO> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }



}
