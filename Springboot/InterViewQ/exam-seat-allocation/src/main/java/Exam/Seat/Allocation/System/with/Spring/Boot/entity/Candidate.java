package Exam.Seat.Allocation.System.with.Spring.Boot.entity;



import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "candidates")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "registration_number")
    private String registrationNumber;

    @NotNull
    @Column(name = "candidate_name")
    private String candidateName;

    @NotNull
    private String gender;

    @NotNull
    @Column(name = "applied_post")
    private String appliedPost;

    @NotNull
    @Column(name = "is_pwd")
    private Boolean isPwd;


}