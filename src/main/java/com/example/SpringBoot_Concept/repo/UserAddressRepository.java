package com.example.SpringBoot_Concept.repo;

import com.example.SpringBoot_Concept.entity.UserAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAddressRepository extends JpaRepository<UserAddress , Long> {
}
