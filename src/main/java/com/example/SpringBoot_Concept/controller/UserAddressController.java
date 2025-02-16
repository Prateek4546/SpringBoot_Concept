package com.example.SpringBoot_Concept.controller;

import com.example.SpringBoot_Concept.entity.UserAddress;
import com.example.SpringBoot_Concept.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserAddressController {

    UserAddressService userAddressService;

    @Autowired
    public  UserAddressController(UserAddressService userAddressService){
        this.userAddressService = userAddressService;
    }

    @GetMapping("/getAdd/{id}")
    public ResponseEntity getAddress(@PathVariable Long id)
    {
        UserAddress userAddress = userAddressService.findAddress(id);
        return new ResponseEntity(userAddress , HttpStatus.OK);
    }
}
