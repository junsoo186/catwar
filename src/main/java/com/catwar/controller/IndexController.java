package com.catwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class IndexController {

	@GetMapping("/")
	public String main() {
		return "index";
	}
	
	@GetMapping("/game")
	public String gamePage() {
		return "main";
	}
	
	
}
