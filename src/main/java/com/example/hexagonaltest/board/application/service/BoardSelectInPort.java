package com.example.hexagonaltest.board.application.service;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;
import com.example.hexagonaltest.board.application.port.in.SelectUseCase;
import com.example.hexagonaltest.board.application.port.out.BoardSelectOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BoardSelectInPort implements SelectUseCase {
    private final BoardSelectOutputPort outputPort;
    @Override
    public BoardResponseDTO getData(Long boardNo) {
        return outputPort.getBoard(boardNo);
    }

    @Override
    public List<BoardResponseDTO> getAll() {
        return outputPort.getBoardList();
    }
}
