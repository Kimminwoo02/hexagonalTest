package com.example.hexagonaltest.board.adaptor.out.persistence;


import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;
import com.example.hexagonaltest.board.application.port.out.BoardCreateOutputPort;
import com.example.hexagonaltest.board.application.port.out.BoardSelectOutputPort;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

// 아웃 바운드 어뎁터가 된다.(DAO Impl 역할을 한다.)
// 어뎁터와 디비가 어떻게 연동되는지 정의
@Component
@RequiredArgsConstructor
public class JPABoardOutputAdaptor  implements BoardCreateOutputPort, BoardSelectOutputPort {
    private final BoardRepository repository;
    private final BoardMapper mapper;

    @Override
    public String createBoard(BoardInputDTO board) {
        repository.save(mapper.domainToEntity(board));
        return "ok";
    }


    @Override
    public BoardResponseDTO getBoard(Long boardNo) {
        return mapper.entityToDomain(repository.findByBoardNo(boardNo));
    }

    @Override
    public List<BoardResponseDTO> getBoardList() {
        ModelMapper mapper1 = new ModelMapper();

        return repository.findAll().stream()
                .map(entity -> mapper1.map(entity, BoardResponseDTO.class))
                .collect(Collectors.toList());
    }

}
