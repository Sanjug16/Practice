package com.practice.Student.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "student_details")
public class Student {
    @Id
    @Column(name = "student_id")
    private Long studentId;

    @Column(name="student_name")
    private String Name;

    @Column(name="student_email")
    private String email;

    @Column(name="student_grade")
    private String grade;
}
