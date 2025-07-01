package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.UUID;

@Data
@Schema
(
        description = "Data Transfer Object representing an item in the shopping cart",
        name = "CartItemDto",
        title = "Cart Item Data Transfer Object"
)
public class CartItemDto {

    @Schema(description = "Unique identifier for the cart item", example = "123e4567-e89b-12d3-a456-426614174000")
    private UUID id;

    @Schema(description = "Unique identifier for the product associated with this cart item", example = "123e4567-e89b-12d3-a456-426614174000")
    private UUID productId;

    @Schema(description = "Quantity of the product in the cart item", example = "2")
    private int quantity;

    @Schema(description = "Product details associated with this cart item", implementation = ProductDto.class)
    private ProductDto product;
}