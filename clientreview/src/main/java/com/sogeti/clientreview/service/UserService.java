package com.sogeti.clientreview.service;

import java.util.Optional;

import com.sogeti.clientreview.documents.User;

public interface UserService {

	User save (User user);
	Optional<User> findById (String userId);
}
