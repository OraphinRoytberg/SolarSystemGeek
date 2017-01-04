package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.AlienAgeCalculator;

@Controller
public class AlienAgeController {
	
	@RequestMapping("/alienAgeInput")
	public String showAlienAgeInput() {
		return "alienAgeInput";
	}

	@RequestMapping("/alienAgeResult")
	public String calculateAlienAgeResult(HttpServletRequest request) {
		
		String planet = request.getParameter("planet");
		int earthAge =Integer.parseInt(request.getParameter("earthAge"));
		
		AlienAgeCalculator calculator = new AlienAgeCalculator(planet, earthAge);
		request.setAttribute("calculator", calculator);  // to give access to "view" to use dot
		
		return "alienAgeResult";
	}
}
