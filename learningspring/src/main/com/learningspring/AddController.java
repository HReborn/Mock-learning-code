package com.learningspring;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learningspring.service.AddService;

@Controller
public class AddController {
	@RequestMapping(value="/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response ) {
		
		int n1 = Integer.parseInt(request.getParameter("n1"));
		int n2 = Integer.parseInt(request.getParameter("n2"));
		
		AddService as = new AddService();
		int result = as.add(n1, n2);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("displayer.jsp");
		mv.addObject("result", result);
		
		return mv;
	}
}
