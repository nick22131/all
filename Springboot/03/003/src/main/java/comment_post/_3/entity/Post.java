package comment_post._3.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Post {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column( name = "title", nullable = false)
    private String title;

    @Column( name = "Description", nullable = false)
    private String description;

    @Column( name = "Content", nullable = false)
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true )
    private Set<Comment> comments = new HashSet<>();

}
