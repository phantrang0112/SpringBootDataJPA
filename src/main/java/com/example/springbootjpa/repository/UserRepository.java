package com.example.springbootjpa.repository;

import com.example.springbootjpa.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<user,Long> {
}
