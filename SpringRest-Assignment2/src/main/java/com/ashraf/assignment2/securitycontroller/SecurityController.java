package com.ashraf.assignment2.securitycontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController
{
	@RequestMapping("/userlogin")
	public String userValidation()
	{
		return "This User is Authnorized!!!";
	}
	@RequestMapping("/adminlogin")
	public String adminValidation()
	{
		return "This is a Authnorized Admin";
	}
}
