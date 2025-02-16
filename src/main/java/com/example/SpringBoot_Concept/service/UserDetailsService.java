package com.example.SpringBoot_Concept.service;

import com.example.SpringBoot_Concept.entity.UserDetails;
import com.example.SpringBoot_Concept.exception.UserNotFoundException;
import com.example.SpringBoot_Concept.repo.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsService {

    UserDetailsRepository userDetailsRepository;

    @Autowired
    public UserDetailsService(UserDetailsRepository userDetailsRepository)
    {
        this.userDetailsRepository = userDetailsRepository;
    }

    public UserDetails save(UserDetails userDetails)
    {
        return userDetailsRepository.save(userDetails);
    }
    public  UserDetails getUserById(Long id)
    {
        Optional<UserDetails> userDetails = userDetailsRepository.findById(id);

        if(userDetails.isEmpty()) {
            System.out.println("User not found with ID: " + id);
            throw new UserNotFoundException("User Not found");
        }
        return userDetails.get();
    }
}
