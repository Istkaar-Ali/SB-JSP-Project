package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
	
	@ResponseBody
	@GetMapping("/test")
	public String firstHandler() {
		return "This is my first handler!!";
	}
	
	@GetMapping("/")
	public String home() {
		System.out.println("this is home page");
		return "home";
	}
	
	
	@GetMapping("/contact")
	public String contact() {
		System.out.println("this is contact page");
		return "contact";
	}
}
