package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Schema(
        description = "Data Transfer Object representing a product",
        name = "ProductDto",
        title = "Product Data Transfer Object")
public class ProductDto {

    @Schema(description = "product name", example = "T-Shirt")
    String name;

    @Schema(description = "product description", example = "A comfortable cotton t-shirt")
    String description;

    @Schema(description = "product price", example = "19.99")
    BigDecimal price;

    @Schema(description = "product image URL", example = "https://example.com/images/t-shirt.jpg")
    String imageUrl;

    @Schema(description = "product rating", example = "4.5")
    CategoryDto category;

    @Schema(description = "product inventory details", implementation = InventoryDto.class)
    InventoryDto inventory;

    @Schema(description = "Unique identifier for the product", example = "123e4567-e89b-12d3-a456-426614174000")
    UUID productId;
}
