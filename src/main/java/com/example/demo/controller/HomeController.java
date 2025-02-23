package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/cancel")
	public String cancel() {
		return "cancel";
	}

	@GetMapping("/account")
	public String account() {
		return "account";
	}

	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}

	@GetMapping("/query")
	public String query() {
		return "query";
	}

}
