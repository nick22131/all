package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
