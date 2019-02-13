/**
 * 
 */
package org.rajesh.boda.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author I336121
 *
 */
@Controller
@RequestMapping("/customer")

public class CustomerController {

	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		binder.registerCustomEditor(String.class, trimmer);
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
		System.out.println(">>>" + theCustomer.getFirstName() + "<<<");
		System.out.println(">>>" + theCustomer.getLastName() + "<<<");
		System.out.println(">>>" + theCustomer.getFreePasses() + "<<<");
		System.out.println(">>>" + theCustomer.getPostalCode() + "<<<");
		System.out.println("------------------------------");
		System.out.println(theBindingResult.toString());
		System.out.println("------------------------------");
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}

	}
}
