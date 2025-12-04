package com.example.spring_boot_ex10_JPA_basic.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor // this will generate all arg constructor
@NoArgsConstructor // this will generate no arg constructor

@Entity // this will mark this class as entity
@Table(   // this will generate table
        name = "posts" // this will give table name
//        uniqueConstraints = { @UniqueConstraint(columnNames =  {"title"})} // this will give unique constraint
        // and unique constraint means it will do not allow duplicate of title
)
public class Post {

    @Id // this will mark id as primary key
    @GeneratedValue(  // this will generate id
            strategy = GenerationType.IDENTITY // this will generate auto increment
    )
    private Long id;

    @Column(name = "title", nullable = false ) // this will give column name and provide properties in column
    private String title ;

    @Column(name = "description", nullable =false  )
    private String description;

    @Column (name = "content" , nullable = false)
    private String content;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Comment> comments = new HashSet<>();
}
