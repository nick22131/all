package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.service.serviceImp;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.entity.Student;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.payload.StudentDTO;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.repository.StudentRepository;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.service.StudentService;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImp implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;

    @Override
    public List<StudentDTO> getAllStudents() {

        List<Student> students = studentRepository.findAll();

        return students.stream()
                .map((student) -> modelMapper.map(student,StudentDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getStudentById(Integer id) {
        Student student = studentRepository.findById(id).get();
        return modelMapper.map(student, StudentDTO.class);
    }
}
