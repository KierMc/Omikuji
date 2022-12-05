package com.kiernan.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@GetMapping("/omikuji")
	public String omikujiForm(HttpSession session) {
		return "input.jsp";
	}
	
	@PostMapping("form/process")
	public String processForm(@RequestParam("num") int num, @RequestParam("city") String city, @RequestParam("person") String person, @RequestParam("hobby") String hobby, @RequestParam("thing") String thing, @RequestParam("nice") String nice, HttpSession session) {
		session.setAttribute("num", num);
		session.setAttribute("city", city);
		session.setAttribute("person", person);
		session.setAttribute("hobby", hobby);
		session.setAttribute("thing", thing);
		session.setAttribute("nice", nice);
		return "redirect:/show";
	}
	
	@GetMapping("/show")
	public String displayForm() {
		return "results.jsp";
	}



}
