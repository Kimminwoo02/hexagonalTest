package com.example.hexagonaltest.board.application.service;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.application.port.in.BoardCreateUseCase;
import com.example.hexagonaltest.board.application.port.out.BoardCreateOutputPort;
import com.example.hexagonaltest.board.application.port.out.KafkaEventOutputPort;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

// 외부 어댑터에 의해서 호출되는 input port의 구현체
// => Serviceimpl의 역할

@Service
@Transactional
@RequiredArgsConstructor
public class BoardCreate implements BoardCreateUseCase {
    // DBMS와 통신하는 outputPort
    // Kafka와 통신하는 처리도 필요
    private final BoardCreateOutputPort outputPort;
    private final KafkaEventOutputPort eventOutputPort;
    @Override
    public String createBoardData(BoardInputDTO boardInputDTO) {

        String board = outputPort.createBoard(boardInputDTO);
        //DB에 저장하는 작업과 이벤트를 발행하는 것은 하나로 묶어서 트랜잭션
        // 처리가 되도록 작업
        //
        try {
            eventOutputPort.boardWriteEvent("write_OK");
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return board;
    }

}
