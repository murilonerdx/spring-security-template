package com.murilonerdx.springsecuritytemplate.repository;

import com.murilonerdx.springsecuritytemplate.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {
	Optional<User> findByEmail(String email);
}
