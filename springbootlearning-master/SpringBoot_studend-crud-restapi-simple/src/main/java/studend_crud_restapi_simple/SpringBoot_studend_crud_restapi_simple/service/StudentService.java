package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.service;

import org.springframework.http.ResponseEntity;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.payload.StudentDTO;

import java.util.List;

public interface StudentService {
    public List<StudentDTO> getAllStudents();
    public StudentDTO getStudentById(Integer id);
    public StudentDTO createStudent(StudentDTO studentDTO);

    public StudentDTO updateStudent(Integer id, StudentDTO studentDTO);

   //ResponseEntity<StudentDTO> updateStudentName(int id, String name);

    public StudentDTO patchUpdate (Integer id , StudentDTO patchData);
}
