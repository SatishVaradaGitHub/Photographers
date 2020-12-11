package com.usersbooking.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usersbooking.user.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
