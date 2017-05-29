package com.poly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CategoryController {

	@RequestMapping("/home")
	public String indexx(ModelMap model) {
		
		return "index";
	}

}
