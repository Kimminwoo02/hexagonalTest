package com.example.hexagonaltest.board.application.port.out;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardInputDTO;

// 아웃바운드 포트 - dao단의 DAO 인터페이스
public interface BoardCreateOutputPort {
    String createBoard(BoardInputDTO board);
}
