package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.web.service.AuthService;

@RestController
@RequestMapping ("/v4")
public class ProfieRestApi {
	
	
	@Autowired
	private AuthService authService;
	
	@GetMapping("/signups")
	public List<ProfileDTO> showSignups(Model model){
		 List<ProfileDTO> profileDTOs =authService.findAll();
		   return profileDTOs;
		
	}
	
	
	@GetMapping("/esignups")
	public ProfileDTO edsignup (@RequestParam String temail, Model model){
		 ProfileDTO profileDTO =authService.findByEmail(temail);
		   return profileDTO;
		
	}
	
}
