package com.corsojava.bestoftheyear.controller;




import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;



import org.springframework.ui.Model;

@Controller
@RequestMapping("/")
public class MainController {
	
	@GetMapping
	public String home() {
		return "index";
	}
	
	
	

	
	
	
	
	
}


