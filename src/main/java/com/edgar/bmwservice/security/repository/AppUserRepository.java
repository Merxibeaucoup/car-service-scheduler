package com.edgar.bmwservice.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgar.bmwservice.security.user.User;

public interface AppUserRepository extends JpaRepository<User, Long> {

	Optional<User> findByEmail(String email);

}