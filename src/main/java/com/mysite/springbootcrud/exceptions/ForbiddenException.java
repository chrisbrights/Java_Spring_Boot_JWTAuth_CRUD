package com.mysite.springbootcrud.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ForbiddenException extends RuntimeException{
    private String message;
}
