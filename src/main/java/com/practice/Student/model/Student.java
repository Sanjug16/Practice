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

    private String Name;

    private String email;

    private String grade;
}
