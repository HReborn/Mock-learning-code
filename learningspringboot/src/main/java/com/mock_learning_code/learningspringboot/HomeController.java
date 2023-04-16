package com.mock_learning_code.learningspringboot;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(String name, HttpSession session) {
		session.setAttribute("name", name);
		return "home";
	}

}
