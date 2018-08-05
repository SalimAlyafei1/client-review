package com.sogeti.clientreview.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sogeti.clientreview.documents.User;
import com.sogeti.clientreview.repository.UserRepo;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepo;
	@Override
	public User save(User user) {
		return userRepo.save(user);
	}

	@Override
	public Optional<User> findById(String userId) {
		return userRepo.findById(userId);
	}

	
}
