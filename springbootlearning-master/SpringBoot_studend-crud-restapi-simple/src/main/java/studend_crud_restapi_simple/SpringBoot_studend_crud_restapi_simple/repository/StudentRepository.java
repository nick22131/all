package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
