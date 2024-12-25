package com.atharva.banking_application.repository;

import com.atharva.banking_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
