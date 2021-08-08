package com.app.web;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/restricted")

	public String restricted() {
		return "successful login!!!...";

	}
	@GetMapping("/user")
	
	public Principal user(Principal principal) {
		System.out.println("username: " + principal.getName());

		return principal;
	}

}
