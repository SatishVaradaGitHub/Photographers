package com.usersbooking.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usersbooking.user.model.User;
import com.usersbooking.user.service.UserBookingService;

@RestController
@RequestMapping("/api")
public class UserBookingController {

	@Autowired
	private UserBookingService userBookingService;

	@PostMapping(value = "/createUser", consumes = { "application/json" }, produces = { "application/json" })
	public ResponseEntity<User> createUser(@Validated @RequestBody User user) {
		try {
			User createdUser = userBookingService.saveUser(user);
			return new ResponseEntity<User>(createdUser, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
