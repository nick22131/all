package Exam.Seat.Allocation.System.with.Spring.Boot.repository;




import Exam.Seat.Allocation.System.with.Spring.Boot.entity.ExamCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ExamCenterRepository extends JpaRepository<ExamCenter, Long> {
    List<ExamCenter> findByIsPwdFriendly(Boolean isPwdFriendly);
    ExamCenter findByCenterId(String centerId);
}