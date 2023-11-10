package com.mysite.springbootcrud.dto.auth;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LoginRequest {
    private String password;
    private String username;
}
