package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.Form.Exam01Form;

@Controller
@RequestMapping("/ex-01")

public class Exam01Controller {

	@ModelAttribute
	public Exam01Form setUpForm() {

		return new Exam01Form();
	}
	
	@RequestMapping("")
	
	public String index() {
		return "exam01";
	}
	
	@RequestMapping("/result01")
	public String rusult01(Exam01Form exam01Form,Model model) {
		
		model.addAttribute("name",exam01Form.getName());
		
		
		
		
		return "exam01-result";
		
		
	}

}
