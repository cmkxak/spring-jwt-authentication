package com.example.springsecurity.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserJoinResponse {
    private String userName;
    private String email;
}
