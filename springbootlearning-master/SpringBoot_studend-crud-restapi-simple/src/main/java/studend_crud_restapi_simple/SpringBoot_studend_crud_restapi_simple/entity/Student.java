package studend_crud_restapi_simple.SpringBoot_studend_crud_restapi_simple.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "student")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rollNo;

    @Column(name= "name")
    private String name;

    @Column(name= "percentage")
    private Float percentage;

    @Column(name= "branch")
    private String branch;
}
