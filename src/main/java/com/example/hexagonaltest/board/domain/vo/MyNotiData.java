package com.example.hexagonaltest.board.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
// Serializable을 implements 하면 MyNotidata가 네트워크를 통해서 전송될 수 있는 타입
public class MyNotiData implements Serializable {
    private Long id;
    private String msg;


}
