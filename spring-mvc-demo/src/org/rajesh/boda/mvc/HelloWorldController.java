package org.rajesh.boda.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}

	@RequestMapping("processFormVersionTwo")
	public String letShoutDude(HttpServletRequest request, Model model) {

		String result = "Yo! " + request.getParameter("studentName").toUpperCase();
		model.addAttribute("message", result);
		return "helloworld";
	}
	
	
	@RequestMapping("processFormVersionThree")
	public String letShoutDude(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,  Model model) {

		String result = "Yo! Yo!! Yo!!  " + firstName.toUpperCase() +" "+ lastName.toUpperCase();
		model.addAttribute("message", result);
		return "helloworld";
	}
}
