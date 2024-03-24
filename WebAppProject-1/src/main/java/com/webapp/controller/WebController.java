package com.webapp.controller;

import java.math.BigInteger;
import java.net.http.HttpResponse;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.employee.Employee;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {

	/**
	 * this method will read the client data from the User and print the name E.g.:
	 * http://localhost:8080/home?name=Gyanesh will print "Hi Gyanesh !"
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("oldhome")
	public String home1(HttpServletRequest req, HttpServletResponse res) {
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Hi " + name + " !");
		session.setAttribute("name", name);
		Cookie cookie = new Cookie("name", name);
		res.addCookie(cookie);
		res.addHeader("token", String.valueOf(Math.floor(10000 * Math.random())));
		return "home";
	}

	/**
	 * 
	 * Argument name "name" will be matched with the parameter name So by default
	 * Spring framework checks the variable name with the parameter name
	 * 
	 * In case we want to have a custom name of the argument we can do that by
	 * using @RequestParam annotation
	 * 
	 * @param request
	 * @param response
	 * @return
	 */
	@RequestMapping("oldhome2")
	public String home2(@RequestParam("name") String clientName, HttpSession session) {
		session.setAttribute("name", clientName);
		return "home";
	}

	/**
	 * Spring framework can handle session without explicitly providing it to the
	 * method arguments ModelAndView object can handle both ethe data and the view
	 * fo the web app
	 * 
	 * ModelAndView is super helpful to deal with multiple parameters and view
	 * together without thinking much about the session
	 * 
	 * @param clientName
	 * @return
	 */
	@RequestMapping("oldhome3")
	public ModelAndView home3(@RequestParam("name") String clientName, String surname) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("name", clientName);
		mv.addObject("surname", surname);
//		Cookie cookie = new Cookie("token", String.valueOf((BigInteger.valueOf(100000L * (long) Math.random()))));
		mv.setViewName("home");
		return mv;
	}

	/**
	 * What about passing the whole object of an Employee?
	 * 
	 * The parameters are matched against the variable names of the object
	 * http://localhost:8080/home?name=Avinash&&surname=Kulkarni&&id=12&&salary=1500000&&designation=SDE-1&&department=Engineering
	 * 
	 * @param clientName
	 * @param surname
	 * @return
	 */
	@RequestMapping("home")
	public ModelAndView home(Employee emp) {

		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", emp);
//		Cookie cookie = new Cookie("token", String.valueOf((BigInteger.valueOf(100000L * (long) Math.random()))));
		mv.setViewName("home");
		return mv;
	}
}
