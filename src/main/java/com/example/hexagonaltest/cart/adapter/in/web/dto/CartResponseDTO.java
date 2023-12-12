package com.example.hexagonaltest.cart.adapter.in.web.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CartResponseDTO {
    private Long cartNo;
    private String productName;
    private String customerName;
}
