package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Schema(
        description = "Request object for creating an order",
        name = "CreateOrderRequest",
        title = "Create Order Request")
public class CreateOrderRequest {

    @Schema(description = "Unique identifier for the user placing the order", example = "1")
    private Long userId;

    @Schema(description = "List of items in the order",
            implementation = OrderItemRequest.class,
            type = "array")
    private List<OrderItemRequest> items;

    @Data
    @Schema(
            description = "Data Transfer Object representing an item in the order",
            name = "OrderItemRequest",
            title = "Order Item Request")
    public static class OrderItemRequest {
        private UUID productId;
        private Integer quantity;
        private Double price;
    }
}