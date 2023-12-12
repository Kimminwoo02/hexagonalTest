package com.example.hexagonaltest.cart.adapter.in.web;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardInputDTO;
import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;
import com.example.hexagonaltest.board.common.WebInAdapter;
import com.example.hexagonaltest.cart.adapter.in.web.dto.CartInputDTO;
import com.example.hexagonaltest.cart.adapter.in.web.dto.CartResponseDTO;
import com.example.hexagonaltest.cart.application.usecase.CartCreateUseCase;
import com.example.hexagonaltest.cart.application.usecase.CartSearchUseCase;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@WebInAdapter
@RestController
@RequiredArgsConstructor
public class CartController {

    private final CartCreateUseCase cartCreateUseCase;
    private final CartSearchUseCase cartSearchUseCase;



    @PostMapping("/cartCreate")
    public ResponseEntity<String> createBoard(@RequestBody CartInputDTO cart){
        String result = cartCreateUseCase.create(cart);
        return ResponseEntity.status(HttpStatus.CREATED).body(result);

    }

    @GetMapping("/cart")
    public ResponseEntity<List<CartResponseDTO>> getAllCartList(){
        List<CartResponseDTO> all = cartSearchUseCase.getCartList();
        return ResponseEntity.ok(all);
    }

}
