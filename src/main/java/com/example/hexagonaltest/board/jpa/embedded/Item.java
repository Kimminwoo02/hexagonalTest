package com.example.hexagonaltest.board.jpa.embedded;

import jakarta.persistence.Embeddable;

import java.time.LocalDate;
@Embeddable
public class Item {
    private Long id;
    private LocalDate createDate;
    private boolean state;
}
