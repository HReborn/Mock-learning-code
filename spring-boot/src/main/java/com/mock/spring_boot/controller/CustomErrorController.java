package com.mock.spring_boot.controller;

import org.springframework.boot.webmvc.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.FlashMap;
import org.springframework.web.servlet.FlashMapManager;
import org.springframework.web.servlet.support.RequestContextUtils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class CustomErrorController implements ErrorController {
	
	@GetMapping("/error")
	public String errorFallBack(HttpServletRequest request,
								HttpServletResponse response) {
		FlashMap flashMap = new FlashMap();
		flashMap.put("errorMessage", "The page you are trying to access does not exist.");

		FlashMapManager manager = RequestContextUtils.getFlashMapManager(request);
		if (manager != null) {
		    manager.saveOutputFlashMap(flashMap, request, response);
		} else {
			request.getSession().setAttribute("errorMessage", "The page you are trying to access does not exist.");
		}
		return "redirect:/";
	}
}
