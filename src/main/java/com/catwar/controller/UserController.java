package com.catwar.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.catwar.dto.LoginDTO;
import com.catwar.dto.gameDTO.newNickNameDTO;
import com.catwar.repository.model.User;
import com.catwar.service.UserDetailService;
import com.catwar.service.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	private final HttpSession session;
	private final UserService userService;
	private final UserDetailService userDetailService;
	
	
	@GetMapping("/login")
	public String getlogin() {
		return "user/login";
	}
	
	
	  @PostMapping("/login")
	    public String login(LoginDTO dto, HttpSession session) {
	       
	        User principal = userService.login(dto);  

	        if (principal != null) {
	            
	            session.setAttribute("principal", principal);
	            return "redirect:/game";  
	        } else {
	           
	            return "redirect:/game";  
	        }
	    }
	@GetMapping("/logout")
	public String getlogout() {
		session.invalidate();
		System.out.println("로그아웃성공");
		return "redirect:/game";
	}
	
	@GetMapping("/home")
	public String gethome(Model model) {
		 User principal = (User) session.getAttribute("principal");
		model.addAttribute("principal" ,principal);
		return "user/home";
	}
	@GetMapping("/newGame")
	public String getNewGame(Model model ) {
		User principal = (User) session.getAttribute("principal");
		model.addAttribute("principal" ,principal);
		return  "user/newGame";
	}
	
	@PostMapping("/newNickName")
	public String postNewNickName(newNickNameDTO dto,HttpSession session) {
		User principal = (User) session.getAttribute("principal");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@"+dto.getNickName());
		userDetailService.newNickName(principal.getUserId(), dto);
		return "/main";
		
	}
	@GetMapping("/firstGame")
	public String getFirstGame() {
		return "game/firstGame";
	}
	
	
}
