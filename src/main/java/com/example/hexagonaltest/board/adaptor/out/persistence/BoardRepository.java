package com.example.hexagonaltest.board.adaptor.out.persistence;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity,Long> {
    BoardEntity findByTitle(String title);


    BoardEntity findByBoardNo(Long boardNo);
}
