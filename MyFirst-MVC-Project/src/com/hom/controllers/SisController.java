package com.hom.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis") // @RequestMapping in class level
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String giveMakeUpe()
	{
		return "Ok...Here are the makeups....";
	}

	
	//a controller can have multiple handler methods, a controller can handle multiple url requests
	
	@ResponseBody
	@RequestMapping("/books")
	public String giveBoos()
	{
		return "Take my books here they are....";
	}
}
