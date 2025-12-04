package Exam.Seat.Allocation.System.with.Spring.Boot.repository;




import Exam.Seat.Allocation.System.with.Spring.Boot.entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
    List<Candidate> findByRegistrationNumber(String registrationNumber);

    @Query("SELECT DISTINCT c.registrationNumber FROM Candidate c")
    List<String> findDistinctRegistrationNumbers();

    List<Candidate> findAllByOrderByRegistrationNumber();
}