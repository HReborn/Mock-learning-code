package com.mock_learning_code.learningspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@Autowired
	StudentRepo repo;
	
	@RequestMapping("home")
	public ModelAndView home(Student student) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("stud", student);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/addStudent")
	public ModelAndView add

}
