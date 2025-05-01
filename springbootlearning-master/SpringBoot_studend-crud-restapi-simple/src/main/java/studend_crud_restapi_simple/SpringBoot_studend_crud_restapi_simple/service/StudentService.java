package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.service;

import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.payload.StudentDTO;

import java.util.List;

public interface StudentService {
    public List<StudentDTO> getAllStudents();
    public StudentDTO getStudentById(Integer id);
}
