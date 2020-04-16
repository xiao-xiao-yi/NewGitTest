package cn.blb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/loginView.do")
	public String toLoginView() {
		System.out.println("½øÈë¿ØÖÆÆ÷");
		
		return "helloworld";
	}
	
	
}
