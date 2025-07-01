package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(
        description = "Request object for updating an item in the cart",
        name = "UpdateItemRequest",
        title = "Update Item Request")
public class UpdateItemRequest {
    @Schema(description = "Unique identifier for the item to be updated", example = "123")
    private Long itemId;
    @Schema(description = "quantity for the item", example = "3")
    private Integer quantity;
}