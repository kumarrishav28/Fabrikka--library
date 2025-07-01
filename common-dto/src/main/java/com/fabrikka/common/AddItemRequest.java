package com.fabrikka.common;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Schema(
        description = "Request object for adding an item to the cart",
        name = "AddItemRequest",
        title = "Add Item Request")
public class AddItemRequest {

    @Schema(description = "Unique identifier for the product to be added",
            example = "123e4567-e89b-12d3-a456-426614174000")
    private UUID productId;

    @Schema(description = "Quantity of the product to be added to the cart",
            example = "2")
    private Integer quantity;
}