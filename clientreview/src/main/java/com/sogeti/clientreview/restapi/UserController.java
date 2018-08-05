package com.sogeti.clientreview.restapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.sogeti.clientreview.documents.User;
import com.sogeti.clientreview.service.UserService;

@RestController
@RequestMapping("/clientreviewapp/user")

public class UserController {

	@Autowired
	
	private UserService userService;
	
	@PostMapping
	public ResponseEntity<Void> saveUser(@RequestBody User userJsonStr, UriComponentsBuilder ucBuilder){
		
		userService.save(userJsonStr);
		HttpHeaders headers = new HttpHeaders();
		headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(userJsonStr.getUserId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}
	@GetMapping ("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable String userId)
	
	{
		User searchUser= userService.findById(userId).get();
		return new ResponseEntity<User>(searchUser, HttpStatus.OK);
	}
	
	
}
