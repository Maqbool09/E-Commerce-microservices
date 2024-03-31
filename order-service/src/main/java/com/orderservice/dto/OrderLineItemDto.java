package com.orderservice.dto;

import lombok.*;

import java.math.BigDecimal;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderLineItemDto {

    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}

