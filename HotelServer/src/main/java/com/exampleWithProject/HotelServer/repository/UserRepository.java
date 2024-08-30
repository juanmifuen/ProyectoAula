package com.exampleWithProject.HotelServer.repository;

import com.exampleWithProject.HotelServer.entity.User;
import com.exampleWithProject.HotelServer.enums.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

    Optional<User> findFirtsByEmail(String email);

    Optional<User> findByUserRole(UserRole userRole);

}
