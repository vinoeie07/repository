package com.springboot.springboot_thymeleaf_example;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String index() {
		System.out.println("Index mapping");
		return "index";
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute HomeController user) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Home Controller");
		modelAndView.setViewName("user-data");
		modelAndView.addObject("user", user);
		return modelAndView;
	}
}

class User {

	String name;
	String email;

	public String getName() {  
        return name;  
    }

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {  
        return email;  
    }

	public void setEmail(String email) {
		this.email = email;
	}
}
