package com.hillel.users.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Data
@Entity
@Table(name = "users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    @NotBlank(message = "Name is mandatory")
    String name;

    @NotBlank(message = "Email is mandatory")
    String email;
}