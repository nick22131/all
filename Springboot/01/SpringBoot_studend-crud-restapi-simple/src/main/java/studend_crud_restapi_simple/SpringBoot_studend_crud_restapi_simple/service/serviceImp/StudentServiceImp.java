package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.service.serviceImp;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.entity.Student;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.exception.ResourceNotFoundException;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.payload.StudentDTO;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.repository.StudentRepository;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.service.StudentService;

import java.lang.module.Configuration;
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
                .map((student) -> modelMapper.map(student, StudentDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public StudentDTO getStudentById(Integer id) {
        Student student = studentRepository.findById(id).get();
        return modelMapper.map(student, StudentDTO.class);
    }

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        Student student = modelMapper.map(studentDTO, Student.class);
        Student newStudent = studentRepository.save(student);
        return modelMapper.map(newStudent, StudentDTO.class);
    }

    @Override
    public StudentDTO updateStudent(Integer id, StudentDTO studentDTO) {
        //studentDTO.setRollNo(id);
        Student student = modelMapper.map(studentDTO, Student.class);
        Student updatedStudent = studentRepository.save(student);
        StudentDTO studentDTO1 = modelMapper.map(updatedStudent, StudentDTO.class);
        return studentDTO1;
    }

    @Override
    public StudentDTO patchUpdateModelMapper(Integer id, StudentDTO patchData) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Student", "id", id));
       modelMapper.getConfiguration()
               .setSkipNullEnabled(true);
       modelMapper.map(patchData, student);
       Student updated = studentRepository.save(student);
       return modelMapper.map(updated, StudentDTO.class);

    }

    @Override
    public StudentDTO patchUpdateBasic(Integer id, StudentDTO patchData) {
        Student existingStudent = studentRepository.findById(id)
                .orElseThrow(()->new ResourceNotFoundException("Student","rollNo",id));
        if (patchData.getName() != null) existingStudent.setName(patchData.getName());
        if (patchData.getBranch()!=null) existingStudent.setBranch(patchData.getBranch());
        if (patchData.getPercentage() != null) existingStudent.setPercentage(patchData.getPercentage());
        if(patchData.getRollNo() != null) existingStudent.setRollNo(patchData.getRollNo());
      Student updatedStudent = studentRepository.save(existingStudent);
      return modelMapper.map(updatedStudent, StudentDTO.class);
    }


//    @Override
//    public ResponseEntity<StudentDTO> updateStudentName(int id, String name) {
//      Student s= studentRepository.findById(id).get();
//       s.setName(name);
//        studentRepository.save(s);
//
//
//
//
//
//        return null;
//    }
}
