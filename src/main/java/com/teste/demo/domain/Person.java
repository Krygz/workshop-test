package com.teste.demo.domain;

import jakarta.persistence.*;
import org.hibernate.SessionFactory;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity(name = "USERS")
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String email;
    @Column(name = "birth_date")
    private LocalDate birthDate;

    public Person() {
    }

    public Person(Integer id, String name, String email ,LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate =  birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
