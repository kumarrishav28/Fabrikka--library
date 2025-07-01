package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Schema(
        description = "Data Transfer Object representing the inventory of a product",
        name = "InventoryDto",
        title = "Inventory Data Transfer Object")
public class InventoryDto {

    @Schema(description = "Unique identifier for the inventory record", example = "123e4567-e89b-12d3-a456-426614174000")
    private UUID productId;

    @Schema(description = "Total stock available for the product", example = "100")
    private Integer availableStock;

}
