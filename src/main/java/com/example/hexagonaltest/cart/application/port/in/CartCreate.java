package com.example.hexagonaltest.cart.application.port.in;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartInputDTO;
import com.example.hexagonaltest.cart.adapter.out.persistence.CartRepository;
import com.example.hexagonaltest.cart.application.port.out.CartCreateOutputPort;
import com.example.hexagonaltest.cart.application.usecase.CartCreateUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CartCreate implements CartCreateUseCase {
    private final CartCreateOutputPort outputPort;

    @Override
    public String create(CartInputDTO cartInputDTO) {
        return outputPort.createCart(cartInputDTO);
    }
}
