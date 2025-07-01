package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(
        name = "ErrorResponseDto",
        description = "Schema to hold error response information"
)
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client",
            example = "/api/v1/orders"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error happened",
            example = "BAD_REQUEST"
    )
    private String errorCode;

    @Schema(
            description = "Error message representing the error happened",
            example = "Invalid order ID"
    )
    private String errorMessage;

    @Schema(
            description = "Time representing when the error happened",
            example = "2024-06-10T15:30:00"
    )
    private LocalDateTime errorTime;
}