package com.mock_learning_code.learningspringboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(HttpServletRequest req) {
		String name = req.getParameter("name");
		req.setAttribute("name", name);
//		HttpSession session = req.getSession();
//		session.setAttribute("name", name);
		return "home.jsp";
	}

}
