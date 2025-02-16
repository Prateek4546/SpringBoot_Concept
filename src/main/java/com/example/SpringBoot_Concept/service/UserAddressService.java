package com.example.SpringBoot_Concept.service;


import com.example.SpringBoot_Concept.entity.UserAddress;
import com.example.SpringBoot_Concept.repo.UserAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddressService {

    UserAddressRepository userAddressRepository;

    @Autowired
    public UserAddressService(UserAddressRepository userAddressRepository){
        this.userAddressRepository = userAddressRepository;
    }

    public UserAddress findAddress(Long id){
        return userAddressRepository.findById(id).get();
    }
}
