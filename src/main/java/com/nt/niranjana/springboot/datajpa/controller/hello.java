package com.nt.niranjana.springboot.datajpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nt.niranjana.springboot.datajpa.entity.Book;

@Controller
public class hello 
{
	@GetMapping("/hellouy")
	public String ans(Model model)
	{
		Book book = new Book();
		book.setBookId(101);
		model.addAttribute("data",book);
		return "hello";
	}

}
