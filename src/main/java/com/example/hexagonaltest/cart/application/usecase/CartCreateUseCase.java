package com.example.hexagonaltest.cart.application.usecase;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;
import com.example.hexagonaltest.cart.adapter.in.web.dto.CartInputDTO;
import com.example.hexagonaltest.cart.adapter.in.web.dto.CartResponseDTO;

import java.util.List;

public interface CartCreateUseCase {

    String create(CartInputDTO cartInputDTO);




}
