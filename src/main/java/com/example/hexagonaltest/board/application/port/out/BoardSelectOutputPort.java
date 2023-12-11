package com.example.hexagonaltest.board.application.port.out;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;

import java.util.List;

public interface BoardSelectOutputPort {
    BoardResponseDTO getBoard(Long boardNo);
    List<BoardResponseDTO> getBoardList();
}
