package com.catwar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.catwar.repository.model.User;

import jakarta.servlet.http.HttpSession;

@RestController
@RequestMapping("/auth")
public class AuthController {
	  @GetMapping("/check")
	    public ResponseEntity<Map<String, Boolean>> checkLoginStatus(HttpSession session) {
	        Map<String, Boolean> response = new HashMap<>();

	        User principal = (User) session.getAttribute("principal");

	        if (principal == null) {
	            response.put("loggedIn", false); 
	            return ResponseEntity.ok(response);
	        }

	        response.put("loggedIn", true); 
	        return ResponseEntity.ok(response);
	    }
	
}
