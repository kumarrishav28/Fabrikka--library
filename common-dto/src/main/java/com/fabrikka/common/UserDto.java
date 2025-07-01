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
        description = "Data Transfer Object representing a user",
        name = "UserDto",
        title = "User Data Transfer Object")
public class UserDto {

    @Schema(description = "Unique identifier for the user", example = "1")
    private long userId;
    @Schema(description = "First name of the user", example = "John")
    private String firstName;
    @Schema(description = "Last name of the user", example = "Doe")
    private String lastName;
    @Schema(description = "Email address of the user", example = "xxx@gmail.com")
    private String userEmail;
    @Schema(description = "user password", example = "password123")
    private String password;


}
