package com.bawei.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Demo {

	@RequestMapping("dl")
	public String Tt() {
		
		return "dl";
	}
	
}
