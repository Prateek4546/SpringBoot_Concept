package com.example.SpringBoot_Concept.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity userNotFound(UserNotFoundException userNotFoundExcpetion){
        return  new ResponseEntity<>(userNotFoundExcpetion.getMessage() , HttpStatus.NOT_FOUND);
    }
}
