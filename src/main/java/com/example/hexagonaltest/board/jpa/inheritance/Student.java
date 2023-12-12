package com.example.hexagonaltest.board.jpa.inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student extends Person{
    private String studentId;

    public Student(Long id, String name, String addr, String password, String studentId) {
        super(id, name, addr, password);
        this.studentId = studentId;
    }

}
