package com.belemadrive.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.belemadrive.model.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    // Custom queries can be added here if needed
}
