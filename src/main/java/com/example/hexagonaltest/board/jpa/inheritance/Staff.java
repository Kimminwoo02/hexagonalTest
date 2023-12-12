package com.example.hexagonaltest.board.jpa.inheritance;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Staff extends Person{
    private String staffId;
    private String dept;


}
