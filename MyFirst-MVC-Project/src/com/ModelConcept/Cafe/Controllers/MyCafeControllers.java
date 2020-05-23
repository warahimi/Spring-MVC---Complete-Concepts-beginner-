package com.ModelConcept.Cafe.Controllers;



import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //whenever Spring does a Component Scan, this controller will be registerd wtih spring container, we must configure the <context: component-scan> tag in our config file
public class MyCafeControllers {
	
	
	//Returns a welcom page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) // Model object is uede to send data from controller to View
	{
		
		//Sending some data to our view
		//We can send some data to the view from the controller (data can come from any where, a file, database, user, collection…)
		//we ganan hard code our data here , just to understand the flow of data in Spring, but data can come from any where, 
		
		
		String myName = "Wahidullah Rahimi"; // we can send this data to the view by using an object called Model
		
		model.addAttribute("myNameValue", myName); // now we can access this data in our view using it key (myNameValue)
		//before returning this page we send some data with this page which will be available in view 
		model.addAttribute("myPagesHeader", "MOM`s Page");
		
		return "welcom-page";
	}
	
	//Handles (processOrder) redirec by pressing button and return a page
	@RequestMapping("/processOrder")  // action of the form to be handled here
	public String processOrder(HttpServletRequest request,Model model)
	{
		
		//catch and handle the data recived from user// we can catch the data send bu user (form) by using HttpServletRequest object
		String userData = request.getParameter("foodType");
		
		
		//Set the user data to Model object and send to view (process-order)
		model.addAttribute("user_input", userData);
		
		
		return "process-order";
		
		// Shortcut: to go to process-order page instead of searching in View folder.
		//select the page name ctrl+shft+r
	}

}
