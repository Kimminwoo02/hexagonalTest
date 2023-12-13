package com.example.hexagonaltest.board.jpa.embedded;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmbeddedTestEntity {

    // 외부에 정의한 클래스를 기본키로 사용
    @EmbeddedId
    private MemberId id;
    private String name;
    private String pass;

    @Embedded
    private Address addr;

    // 관계형 데이터베이스에서 컬렉션을 담을 수 있는 구조가 없다.
    // 이를 저장하기 위해서 별도의 테이블을 만들어서 저장해야 한다.
    // String, Integer... 등을 활용하는 경우 많이 사용
    @ElementCollection
    private List<Item> itemList = new ArrayList<>();



}
