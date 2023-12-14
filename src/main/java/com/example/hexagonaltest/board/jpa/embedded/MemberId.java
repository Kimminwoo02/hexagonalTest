package com.example.hexagonaltest.board.jpa.embedded;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.UUID;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Embeddable
public class MemberId implements Serializable {
    private String id;
    // UUID로 id를 만들어서 생성하고 MemberId 객체를 만들어서 리턴하는 메소드
    public static MemberId createMemberId(){
        UUID uuid = UUID.randomUUID();
        String year = String.valueOf(LocalDate.now().getYear());
        String str = year  + "-" + uuid;
        MemberId memberId = new MemberId();
        memberId.setId(str);
        return memberId;
    }

    public static MemberId getMemberId() {

        return MemberId.createMemberId();

    }




}
