package com.learningspring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	@RequestMapping(value="/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response ) {
		
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayer.jsp");
		mv.addObject("result", n1+n2);
		
		return mv;
	}
}
