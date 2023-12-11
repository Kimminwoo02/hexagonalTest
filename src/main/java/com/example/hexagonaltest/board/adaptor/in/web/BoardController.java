package com.example.hexagonaltest.board.adaptor.in.web;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;
import com.example.hexagonaltest.board.application.port.in.BoardCreateUseCase;
import com.example.hexagonaltest.board.application.port.in.SelectUseCase;
import com.example.hexagonaltest.board.common.WebInAdapter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// 인바운드 어뎁터

@WebInAdapter
@RestController("/api")
@RequiredArgsConstructor

public class BoardController {
    // 서비스 상위 정의하고 작업 - port in의 useCase
    private final BoardCreateUseCase boardCreateUseCase;
    private final SelectUseCase searchBoardUseCase;

    @Operation(summary = "게시판 글 등록", description = "게시글내용 입력 -> 게시글 등록 ",
                tags = {"BoardController"})
    @PostMapping("/boardCreate")
    public ResponseEntity<String> createBoard(@RequestBody BoardInputDTO board){
        String result = boardCreateUseCase.createBoardData(board);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);

    }


    @Operation(summary = "게시글 조회", description = "게시글번호(boardNo) -> 게시글상세조회 ",
            tags = {"BoardController"})

    @GetMapping("/board/{boardNo}")
    public ResponseEntity<BoardResponseDTO> searchBoard(
            @Parameter(name = "boardNo", description = "조회할 게시글의 게시글 번호")
            @PathVariable("boardNo")  Long boardNo){
        BoardResponseDTO boardResponseDTO = searchBoardUseCase.getData(boardNo);
        return ResponseEntity.ok(boardResponseDTO);
    }


    @GetMapping("/board")
    public ResponseEntity<List<BoardResponseDTO>> getAllBoardList(){
        List<BoardResponseDTO> all = searchBoardUseCase.getAll();
        return ResponseEntity.ok(all);
    }


}
