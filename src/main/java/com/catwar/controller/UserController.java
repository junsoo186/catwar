package com.catwar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.catwar.dto.gameDTO.newNickNameDTO;
import com.catwar.dto.userDTO.LoginDTO;
import com.catwar.dto.userDTO.SignUpDTO;
import com.catwar.repository.model.User;
import com.catwar.repository.model.UserDetail;
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

	@GetMapping("/signUp")
	public String signUp() {
		return "user/signUp";
	}

	/**
	 * 회원가입 기능
	 * 
	 * @param dto
	 * @return
	 */
	@PostMapping("/signUp")
	public String signUpPost(SignUpDTO dto) {
		userService.joinUser(dto);

		return "user/login";
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
		model.addAttribute("principal", principal);
		return "user/home";
	}

	@GetMapping("/newGame")
	public String getNewGame(Model model) {
		User principal = (User) session.getAttribute("principal");
		model.addAttribute("principal", principal);
		return "user/newGame";
	}

	@PostMapping("/newNickName")
	public String postNewNickName(newNickNameDTO dto, HttpSession session, Model model) {
		User principal = (User) session.getAttribute("principal");
		Integer detailId = userDetailService.newNickName(principal.getUserId(), dto);
		session.setAttribute("detailId", detailId);
		UserDetail userDetail = userDetailService.findDetailById(principal.getUserId(), detailId);
		model.addAttribute("userDetail", userDetail);
		
		return "game/firstGame";

	}
	
	/**
	 * 아직 사용 안하는 메서드
	 * @param session
	 * @param model
	 * @return
	 */
	@GetMapping("/firstGame")
	public String getFirstGame(HttpSession session, Model model) {
		User principal = (User) session.getAttribute("principal");
		Integer detailId = (Integer)session.getAttribute("detailId");
		UserDetail userDetail = userDetailService.findDetailById(principal.getUserId(), detailId);
		return "game/firstGame";
	}

}
