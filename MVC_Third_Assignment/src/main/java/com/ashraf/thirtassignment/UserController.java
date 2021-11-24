package com.ashraf.thirtassignment;



import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

	@RequestMapping("/loginShow")
	public String showLogin()
	{
		return "login";
	}
	
	@RequestMapping(path="/checkingEntry",method=RequestMethod.POST)
	public String receiveInfo(@ModelAttribute User user)
	{
		if (true) 
			
		
		{
			
		
		
			return "error";
		}
		else
		{
			return "success";
		}
	}
}
