package com.example.hexagonaltest.board.adaptor.out.kafka;

import com.example.hexagonaltest.board.application.port.out.KafkaEventOutputPort;
import com.example.hexagonaltest.board.domain.vo.MyNotiData;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class KafkaProducerOutputAdapter implements KafkaEventOutputPort {
    @Value("${producers.topic1.name}")
    private String BASIC_TOPIC;
    @Value("${producers.topic2.name}")
    private String NOTI_TOPIC;
    private final KafkaTemplate<String,String> basicKafkaTemplate;
    private final KafkaTemplate<String,MyNotiData> notiTemplate;
    @Override
    public void boardWriteEvent(String msg) throws JsonProcessingException {
        basicKafkaTemplate.send(BASIC_TOPIC,"게시글 등록");
    }

    @Override
    public void notiWriteEvent(MyNotiData data) throws JsonProcessingException {


    }
}
