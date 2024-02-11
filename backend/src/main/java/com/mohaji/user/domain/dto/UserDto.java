package com.mohaji.user.domain.dto;

import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String userId;
    private String password;
}
