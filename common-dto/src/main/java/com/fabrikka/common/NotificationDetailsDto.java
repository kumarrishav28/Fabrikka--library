package com.fabrikka.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Schema(
        description = "Data Transfer Object representing notification details",
        name = "NotificationDetailsDto",
        title = "Notification Details Data Transfer Object")
public class NotificationDetailsDto {

    @Schema(
            description = "Map of user identifiers to email addresses to send the notification to",
            type = "object",
            example = "{\"user1\":\"xxx@gmail.com\",\"user2\":\"yyy@gmail.com\"}"
    )
    Map<String,String> toUserDetails;


    @Schema(
            description = "Map of user identifiers to email addresses to send the notification as CC",
            type = "object",
            example = "{\"user1\":\"xxx@gmail.com\",\"user2\":\"yyy@gmail.com\"}"
    )
    Map<String,String> ccUserDetails;

    @Schema(
            description = "Template name for the notification",
            example = "order-confirmation"
    )
    public String templateName;

    @Schema(
            description = "Whether to send attachments with the notification",
            example = "true"
    )
    public boolean sendAttachment;

    @Schema(
            description = "Batch notification attributes",
            type = "object",
            example = "{\"attribute1\":\"value1\",\"attribute2\":\"value2\"}"
    )
    Map<String,String> batchNotificationAttributes = new HashMap<>();

}
