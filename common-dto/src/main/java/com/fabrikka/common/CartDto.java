package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.util.List;
import java.util.UUID;

@Data
@Schema(
        description = "Data Transfer Object representing a user's shopping cart",
        name = "CartDto",
        title = "Cart Data Transfer Object")
public class CartDto {

    @Schema(description = "Unique identifier for the cart", example = "123e4567-e89b-12d3-a456-426614174000")
    private UUID id;

    @Schema(description = "Unique identifier for the user who owns the cart", example = "1")
    private Long userId;

    @Schema(description = "List of items in the cart",
            implementation = CartItemDto.class,
            type = "array")
    private List<CartItemDto> items;
}