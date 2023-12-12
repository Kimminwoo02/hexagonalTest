package com.example.hexagonaltest.cart.application.port.in;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartInputDTO;
import com.example.hexagonaltest.cart.adapter.in.web.dto.CartResponseDTO;
import com.example.hexagonaltest.cart.application.port.out.CartCreateOutputPort;
import com.example.hexagonaltest.cart.application.port.out.CartSearchOutputPort;
import com.example.hexagonaltest.cart.application.usecase.CartCreateUseCase;
import com.example.hexagonaltest.cart.application.usecase.CartSearchUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class CartSearch implements CartSearchUseCase {
    private final CartSearchOutputPort outputPort;

    @Override
    public List<CartResponseDTO> getCartList() {
        return outputPort.getCartList();
    }
}
