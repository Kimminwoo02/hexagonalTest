package com.example.hexagonaltest.cart.adapter.out.persistence;

import com.example.hexagonaltest.cart.adapter.in.web.dto.CartInputDTO;
import com.example.hexagonaltest.cart.adapter.in.web.dto.CartResponseDTO;
import com.example.hexagonaltest.cart.application.port.out.CartCreateOutputPort;
import com.example.hexagonaltest.cart.application.port.out.CartSearchOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class JPACartOutputAdapter implements CartCreateOutputPort , CartSearchOutputPort {
    private final CartRepository repository;
    private final CartMapper mapper;

    @Override
    public String createCart(CartInputDTO cart) {
        repository.save(mapper.domainToEntity(cart));
        return "ok";
    }

    @Override
    public List<CartResponseDTO> getCartList() {
        return repository.findAll()
                .stream().map(mapper::entityToDomain)
                .collect(Collectors.toList());
    }
}
