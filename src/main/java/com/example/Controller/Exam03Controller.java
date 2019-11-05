package com.example.Controller;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ex-03")
public class Exam03Controller {
	@Autowired
	private ServletContext application;

	@RequestMapping("")
	public String index() {
		return "exam03";
	}

	@RequestMapping("/buy")
	public String buy(int num1, int num2, int num3) {
		int taxEx = num1 + num2 + num3;
		int taxIn = (int) (taxEx * 1.10);
		application.setAttribute("taxEx", taxEx);
		application.setAttribute("taxIn", taxIn);

		return "exam03-result";
	}

}
