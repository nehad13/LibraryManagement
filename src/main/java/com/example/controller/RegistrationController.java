package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.entity.User;
import com.example.service.UserService;

@Controller

public class RegistrationController{
	private final UserService userService;
	
	public RegistrationController(UserService userService) {
		
		this.userService=userService;
		
	}
	@GetMapping("/register")
	public String register(Model model) {
		
		model.addAttribute("user", new User());
		return "register";
		
	}
	
	@PostMapping("/register")
    public String registerUser(@ModelAttribute("user") User user) {
        userService.register(user);
        return "redirect:/login";
    }
	
	
}
