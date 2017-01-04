package com.techelevator.ssg.controller;
	
	import javax.servlet.http.HttpServletRequest;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;

	import com.techelevator.ssg.model.AlienTravelCalculator;


	@Controller
	public class AlienTravelController {
		
		@RequestMapping("/alienTravelInput")
		public String showAlienTravelInput() {
			return "alienTravelInput";
		}

		@RequestMapping("/alienTravelResult")
		public String calculateAlienTravelResult(HttpServletRequest request) {
			
			String planet = request.getParameter("planet");
			String transportation = request.getParameter("transportation");
			int earthAge =Integer.parseInt(request.getParameter("earthAge"));
			
			
			AlienTravelCalculator calculator = new AlienTravelCalculator(planet, transportation, earthAge);
			request.setAttribute("calculator", calculator);  // to give access to "view" to use dot
			
			return "alienTravelResult";
		}
	}




