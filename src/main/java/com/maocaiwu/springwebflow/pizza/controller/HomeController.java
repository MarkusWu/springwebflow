package com.maocaiwu.springwebflow.pizza.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@RequestMapping({"/", "/home"})
	public String showHomePage(Model model){
		String[] arrays = {"stay focus", "work harder", "purchase my dream", "be better"};
		List<String> maocaiMusts= Arrays.asList(arrays);
		model.addAttribute("maocaiMusts",maocaiMusts);
		return "home";
	}
	
}
