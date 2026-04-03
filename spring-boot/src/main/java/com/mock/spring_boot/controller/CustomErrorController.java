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
		
		Object status = request.getAttribute("jakarta.servlet.error.status_code");
	    Object exception = request.getAttribute("jakarta.servlet.error.exception");
	    Object message = request.getAttribute("jakarta.servlet.error.message");
	    Object path = request.getAttribute("jakarta.servlet.error.request_uri");

	    System.out.println("Status: " + status);
	    System.out.println("Exception: " + exception);
	    System.out.println("Message: " + message);
	    System.out.println("Path: " + path);
	    
	    String statusCode = status != null ? status.toString() : "";
	    String errorMessage = "Something went wrong. Status: " + status + ". ";
	    
        switch (statusCode) {
            case "404":
                errorMessage += "Page not found.";
                break;
            case "403":
                errorMessage += "Access denied.";
                break;
            case "500":
                errorMessage += "Internal server error.";
                break;
        }
		
		FlashMap flashMap = new FlashMap();
		flashMap.put("errorMessage", errorMessage);

		FlashMapManager manager = RequestContextUtils.getFlashMapManager(request);
		if (manager != null) {
		    manager.saveOutputFlashMap(flashMap, request, response);
		} else {
			request.getSession().setAttribute("errorMessage", errorMessage);
		}
		
		// Ignore static resource 404s
        if (statusCode.equals("404")) {
            return null; // let Spring handle it normally
        }
        
		return "redirect:/";
	}
}
