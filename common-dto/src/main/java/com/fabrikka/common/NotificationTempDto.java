package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Schema(
        description = "Data Transfer Object representing a notification template",
        name = "NotificationTempDto",
        title = "Notification Template Data Transfer Object")
public class NotificationTempDto {

    @Schema(
            description = "Template name for the notification",
            example = "order-confirmation")
    private String templateName;

    @Schema(
            description = "Subject of the notification",
            example = "Your order has been confirmed")
    private String subject;

    @Schema(
            description = "dynamic fields for the notification template, such as user and subject",
            example = "user,subject")
    private String dynamicFields;


}
