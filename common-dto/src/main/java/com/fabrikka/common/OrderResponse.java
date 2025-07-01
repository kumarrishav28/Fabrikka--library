package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@Schema(
        description = "Response object for an order",
        name = "OrderResponse",
        title = "Order Response")
public class OrderResponse {

    @Schema(description = "Unique identifier for the order", example = "1234567890")
    private Long orderId;

    @Schema(description = "Unique identifier for the user who placed the order", example = "1")
    private Long userId;

    @Schema(description = "Timestamp when the order was created", example = "2023-10-01T12:00:00")
    private LocalDateTime createdAt;

    @Schema(description = "Current status of the order", example = "PENDING")
    private String status;

    @Schema(description = "Total amount for the order", example = "99.99")
    private Double totalAmount;

    @Schema(description = "List of items in the order",
            implementation = OrderItemResponse.class,
            type = "array")
    private List<OrderItemResponse> items;

    @Data
    @Builder
    @Schema(
            description = "Data Transfer Object representing an item in the order",
            name = "OrderItemResponse",
            title = "Order Item Response")
    public static class OrderItemResponse {
        private UUID productId;
        private Integer quantity;
        private Double price;
    }
}
