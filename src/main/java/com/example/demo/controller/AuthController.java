package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.dto.RegistrationDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class AuthController {

	@Autowired
	private UserService userService;

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/register")
	public String registerUser(RegistrationDto registrationDto) {
		User user = new User();
		user.setUsername(registrationDto.getUsername());
		user.setPassword(registrationDto.getPassword());
		user.setPhone(registrationDto.getPhone());
		user.setEmail(registrationDto.getEmail());
		user.setRole("USER");
		userService.saveUser(user);
		return "redirect:/login";
	}

	@GetMapping("/")
	public String home() {
		return "home";
	}
}
