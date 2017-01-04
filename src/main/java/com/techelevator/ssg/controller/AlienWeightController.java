package com.techelevator.ssg.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techelevator.ssg.model.AlienWeightCalculator;

@Controller
public class AlienWeightController {
	
	@RequestMapping("/alienWeightInput")
	public String showAlienWeightInput() {
		return "alienWeightInput";
	}

	@RequestMapping("/alienWeightResult")
	public String calculateAlienWeightResult(HttpServletRequest request) {
		
		String planet = request.getParameter("planet");
		int earthWeight =Integer.parseInt(request.getParameter("earthWeight"));
		
		AlienWeightCalculator calculator = new AlienWeightCalculator(planet, earthWeight);
		request.setAttribute("calculator", calculator);  // to give access to "view" to use dot
		
		return "alienWeightResult";
	}
}

