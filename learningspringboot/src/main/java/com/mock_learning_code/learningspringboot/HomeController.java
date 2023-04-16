package com.mock_learning_code.learningspringboot;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(@RequestParam("name") String myName, HttpSession session) {
		session.setAttribute("name", myName);
		return "home";
	}

}
