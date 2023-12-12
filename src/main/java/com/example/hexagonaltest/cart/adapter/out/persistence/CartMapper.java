package com.example.hexagonaltest.cart.adapter.out.persistence;

import com.example.hexagonaltest.board.adaptor.in.web.dto.BoardResponseDTO;
import com.example.hexagonaltest.cart.adapter.in.web.dto.CartInputDTO;
import com.example.hexagonaltest.cart.adapter.in.web.dto.CartResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;

@Component
public class CartMapper {
    public CartEntity domainToEntity(CartInputDTO cart){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(cart, CartEntity.class);
    }

    public CartResponseDTO entityToDomain(CartEntity entity){
        ModelMapper mapper = new ModelMapper();
        return mapper.map(entity,CartResponseDTO.class);
    }
}
