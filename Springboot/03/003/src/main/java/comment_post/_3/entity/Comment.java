package comment_post._3.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Comment {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column( name = "Name", nullable = false)
    private String name;

    @Column (name = "email", nullable = false)
    private String email;

    @Column(name = "Body", nullable = false)
    private String body;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "post_id", nullable = false)
    private Post post;


}
