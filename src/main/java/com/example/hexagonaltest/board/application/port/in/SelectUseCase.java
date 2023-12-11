package com.example.hexagonaltest.board.application.port.in;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;

import java.util.List;

public interface SelectUseCase {
    BoardResponseDTO getData(Long boardNo);
    List<BoardResponseDTO> getAll();

}
