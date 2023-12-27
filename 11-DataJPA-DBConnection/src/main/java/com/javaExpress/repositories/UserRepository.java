package com.javaExpress.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaExpress.models.User;

public interface UserRepository  extends JpaRepository<User, Integer>{

}
