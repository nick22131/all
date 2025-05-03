package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.payload.StudentDTO;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")

public class StudentController {
   private final StudentService studentService;
   //http://localhost:8080/api/student/get-all
    @GetMapping("/get-all")
    public ResponseEntity<List<StudentDTO>> getAllStudents (){
        List<StudentDTO> students = studentService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    //http://localhost:8080/api/student/get/1
    @GetMapping("/get/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable(value = "id") Integer id){
        StudentDTO studentDTO =studentService.getStudentById(id);
        return new ResponseEntity<>(studentDTO, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<StudentDTO> createStudent(@RequestBody StudentDTO studentDTO){
        StudentDTO createdStudent = studentService.createStudent(studentDTO );
        return new ResponseEntity<>(createdStudent, HttpStatus.CREATED);
    }


    @PutMapping("/update/{id}")
    public ResponseEntity<StudentDTO> updateStudent(@PathVariable Integer id,@RequestBody StudentDTO studentDTO){
        StudentDTO studentUpdated =  studentService.updateStudent(id,studentDTO);
        return new ResponseEntity<>(studentUpdated, HttpStatus.CREATED);
    }

    @PatchMapping("/patch/{id}")
    public ResponseEntity<StudentDTO> patchUpdateStudent(@PathVariable Integer id,
                                                         @RequestBody StudentDTO patchData) {

         StudentDTO patched = studentService.patchUpdate(id, patchData );
         return new ResponseEntity<>(patched, HttpStatus.OK );
    }

//    @PutMapping("/update1/{id}")
//    public ResponseEntity<StudentDTO> updateStudent(@PathVariable int id,@RequestParam String name){
//        return studentService.updateStudentName(id,name);
//    }

}
