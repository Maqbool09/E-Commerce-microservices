package com.Microservice.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(value = "product")
@Builder
public class Product {
    private String id;
    private String name;
    private String description;
    private BigDecimal price;
}
