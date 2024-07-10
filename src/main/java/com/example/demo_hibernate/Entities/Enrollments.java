package com.example.demo_hibernate.Entities;

import jakarta.persistence.*;

@Entity
@Table(name = "enrollments")
public class Enrollments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn
    private Students students;

    @ManyToOne
    @JoinColumn
    private Classes classes;

    public Enrollments() {
    }

    public Enrollments(Integer id, Students students, Classes classes) {
        this.id = id;
        this.students = students;
        this.classes = classes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Students getStudents() {
        return students;
    }

    public void setStudents(Students students) {
        this.students = students;
    }

    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }
}
