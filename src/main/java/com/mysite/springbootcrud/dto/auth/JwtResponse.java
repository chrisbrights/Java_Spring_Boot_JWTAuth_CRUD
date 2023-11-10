package com.mysite.springbootcrud.dto.auth;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;


@Setter
@Getter
public class JwtResponse {
    private String jwt;
    private Long id;
    private String username;
    private Set<String> roles;

    public JwtResponse(String jwt, Long id, String username, Set<String> roles) {
        this.jwt = jwt;
        this.id = id;
        this.username = username;
        this.roles = roles;

    }
}
