package com.example.SpringBoot_Concept.controller;

import com.example.SpringBoot_Concept.entity.UserDetails;
import com.example.SpringBoot_Concept.service.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserDetailsController {

  private final UserDetailsService userDetailsService;

  @Autowired
    public  UserDetailsController(UserDetailsService userDetailsService)
    {
        this.userDetailsService = userDetailsService;
    }


    @PostMapping("/save_user")
    public ResponseEntity<UserDetails> saveUserDetails(@RequestBody UserDetails userDetails)
    {
       UserDetails userDetails1 = userDetailsService.save(userDetails);
       return new ResponseEntity<>(userDetails1 , HttpStatus.OK );
    }




    @GetMapping("/get_user/{userId}")
    public  ResponseEntity getUserById(@PathVariable  Long userId)
    {

            UserDetails userDetails1 = userDetailsService.getUserById(userId);
            return new ResponseEntity<>(userDetails1, HttpStatus.OK);


    }

}
