package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/greeting")
public class HelloController {

	public HelloController() {
		// TODO Auto-generated constructor stub
	}
	@RequestMapping(value = "/hello")
	public String sayHello() {
		return("Hello");
	}

}
