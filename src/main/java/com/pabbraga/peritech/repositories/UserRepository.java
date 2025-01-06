package com.pabbraga.peritech.repositories;

import com.pabbraga.peritech.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
