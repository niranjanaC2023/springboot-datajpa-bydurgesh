package com.nt.niranjana.springboot.datajpa.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController 
{
	@RequestMapping(value="/showform",method=RequestMethod.GET)
	public String showForm(Model model)
	{
		System.out.println("Inside showForm method..");
		model.addAttribute("name","Niranjana");
		model.addAttribute("Date",new Date().toLocaleString());
		return "form";
	}

}
