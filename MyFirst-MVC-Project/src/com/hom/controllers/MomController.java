package com.hom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//@Controller			//to make a class a Controller // to tell Spring this is a controller // this is not a normal class this is a controller class
//					// this is same as @Component Annotation: @Coponent tells Spring to make object of this class and put inside your container, and we needed to activated compnentscanning
//					//only thing is that we use @controller for we projects . 
////Spring will Scan the package and make object for all classes with @controller annotation, and register the objects with spring container
@Controller
public class MomController {
	
//	@ResponseBody // to show the method return message in browser , this will write the method return string in HTTP response 
//	//when any client send a request with ...../suger we will give him back this message in http response body so that to be displayed in the browder
//	@RequestMapping("/suger") // mapping the method with a url, this method will be called when a request come with this url
	
	@ResponseBody
	@RequestMapping("/suger")
	public String giveSuger()
	{
		return "ok.. Here is your suger...";
	}

}
