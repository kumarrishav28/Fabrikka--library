package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Schema(
        description = "Data Transfer Object representing a product category",
        name = "CategoryDto",
        title = "Category Data Transfer Object")
public class CategoryDto {

    @Schema(description = "Name of the category", example = "Shirts")
    String name;
}
