package com.application.courselibrary.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name="publisher")
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="name", length = 50, nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
    private Set<Books> books= new HashSet<Books>();


}
