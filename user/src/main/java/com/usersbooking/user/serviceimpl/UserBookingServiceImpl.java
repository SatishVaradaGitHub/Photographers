package com.usersbooking.user.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usersbooking.user.dao.UserRepository;
import com.usersbooking.user.model.User;
import com.usersbooking.user.service.UserBookingService;

@Service
public class UserBookingServiceImpl implements UserBookingService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		User savedEntity = userRepository.save(user);
		return savedEntity;
	}

}
