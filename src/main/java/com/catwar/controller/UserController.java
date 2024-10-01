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
import com.catwar.repository.model.User;
import com.catwar.service.UserService;

import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
	private final HttpSession session;
	private final UserService userService;
	
	
	@GetMapping("/login")
	public String getlogin() {
		return "user/login";
	}
	
	
	
	  @PostMapping("/login")
	    public String login(LoginDTO dto, HttpSession session) {
	        // 로그인 처리 로직
	        User principal = userService.login(dto);  // LoginDTO에서 이메일과 비밀번호 받아서 처리

	        if (principal != null) {
	            // 로그인 성공 시 세션에 사용자 정보 저장
	            session.setAttribute("principal", principal);
	            return "redirect:/game";  // 메인 페이지로 리다이렉트
	        } else {
	            // 로그인 실패 시 로그인 페이지로 리다이렉트
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
	public String getNewGame(Model model) {
		User principal = (User) session.getAttribute("principal");
		model.addAttribute("principal" ,principal);
		return  "user/newGame";
	}
	
	
}
