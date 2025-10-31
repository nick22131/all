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
@Table(name = "exam_centers")
public class ExamCenter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "center_id")
    private String centerId;

    @NotNull
    @Column(name = "center_name")
    private String centerName;

    @NotNull
    private Integer capacity;

    @NotNull
    @Column(name = "is_pwd_friendly")
    private Boolean isPwdFriendly;

    // Constructors

}