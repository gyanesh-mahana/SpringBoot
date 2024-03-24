package com.webapp.controller;

import java.net.http.HttpResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {

	/**
	 * 
	 * 
	 * this method will read the client data from the User and print the name E.g.:
	 * http://localhost:8080/home?name=Gyanesh will print "Hi Gyanesh !"
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping("home")
	public String home(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Hi " + name + " !");
		session.setAttribute("name", name);
		Cookie cookie = new Cookie("name", name);
		res.addCookie(cookie);
		res.addHeader("token", String.valueOf(Math.floor(10000*Math.random())));
		return "home";
	}
}
