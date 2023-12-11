package com.example.hexagonaltest.board.adaptor.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardInputDTO {
    private String title;
    private String content;
    private String writer;
}
