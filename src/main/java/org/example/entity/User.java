package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")

@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor

public class User {

    @Id
    int id;

    @Column(name = "age")
    int age;

    @Column(name = "name")
    String name;

}
