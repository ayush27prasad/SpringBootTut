package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/shopping")
public class RegistrationController {

	public RegistrationController() {
		// TODO Auto-generated constructor stub
	}
	
	@RequestMapping("/register")
	public String registerUser() {
		return("<form action=\"/shopping/addUser\" method=\"POST\">\n"
				+ "<label> Firstname </label>         \n"
				+ "<input type=\"text\" id=\"fname\" name=\"fname\" size=\"15\"/> <br> <br>  \n"
				+ "<label> Lastname: </label>         \n"
				+ "<input type=\"text\" id=\"lname\" name=\"lname\" size=\"15\"/>  \n"
				+ "<input type=\"submit\" value=\"Submit\">\n"
				+ "</form>");
	}
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String printUserGreeting(@RequestParam String fname, @RequestParam String lname) {
		return("Form Submitted " + fname + " " + lname);
	}
	

}
