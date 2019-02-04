package org.rajesh.boda.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {

		// create a student object Student
		Student theStudent = new Student();

		// add student object to the model
		theModel.addAttribute("student", theStudent);

		// add the country options to the model
		theModel.addAttribute("theCountryOptions", countryOptions);

		return "student-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent) {
		System.out.println("fn---" + theStudent.getFirstName());
		System.out.println("ln --" + theStudent.getLastName());
		return "student-confirmation";
	}

	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
}
