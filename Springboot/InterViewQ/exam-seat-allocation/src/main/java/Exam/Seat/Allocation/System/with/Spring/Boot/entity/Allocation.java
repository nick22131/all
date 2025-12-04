package Exam.Seat.Allocation.System.with.Spring.Boot.entity;





import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "allocations")
public class Allocation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "registration_number")
    private String registrationNumber;

    @NotNull
    @Column(name = "applied_post")
    private String appliedPost;

    @Column(name = "center_name")
    private String centerName;

    @Column(name = "slot_time")
    private String slotTime;

    @Column(name = "exam_date")
    private LocalDate examDate;

    @NotNull
    @Enumerated(EnumType.STRING)
    private AllocationStatus status;

    public enum AllocationStatus {
        ALLOCATED, PENDING
    }

    // Constructors
    public Allocation() {}

    public Allocation(String registrationNumber, String appliedPost,
                      String centerName, String slotTime, LocalDate examDate,
                      AllocationStatus status) {
        this.registrationNumber = registrationNumber;
        this.appliedPost = appliedPost;
        this.centerName = centerName;
        this.slotTime = slotTime;
        this.examDate = examDate;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getRegistrationNumber() { return registrationNumber; }
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }

    public String getAppliedPost() { return appliedPost; }
    public void setAppliedPost(String appliedPost) { this.appliedPost = appliedPost; }

    public String getCenterName() { return centerName; }
    public void setCenterName(String centerName) { this.centerName = centerName; }

    public String getSlotTime() { return slotTime; }
    public void setSlotTime(String slotTime) { this.slotTime = slotTime; }

    public LocalDate getExamDate() { return examDate; }
    public void setExamDate(LocalDate examDate) { this.examDate = examDate; }

    public AllocationStatus getStatus() { return status; }
    public void setStatus(AllocationStatus status) { this.status = status; }
}