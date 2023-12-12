package com.example.hexagonaltest.board.application.port.out;

import com.example.hexagonaltest.board.domain.vo.MyNotiData;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface KafkaEventOutputPort {
    void boardWriteEvent(String msg) throws JsonProcessingException;
    void notiWriteEvent(MyNotiData data) throws JsonProcessingException;
}
