package com.hom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {
	
	//@ResponseBody // no need when our method returns a veiw
	@RequestMapping("/cricketbat")
	public String giveCricketBat()
	{
		//return "Ok...Here is the Cricket Bat....";
		
		//to make the controller return a view / webpage
//		return "/WEB-INF/view/CricketBat.jsp"; // this way is tightly coupled. instead better to use View Resolver 
		// the view location and the view extention might be changing. we can solve this issue using the View Resolver (the view name does not change)
		//the way to return a view is to return only the view name with no extention and path
		
		return "CricketBat"; // base name.
		// this name will be returned to the DispatcherServlet, DispatcherServlet doesnt know where this file is 
		//located and what the extention to this file is. to resolve it we use the View Resolver
		//DS passes the name to the view resolver, view resolver add the path and extention to the name and send it back to DS
	}

}
