package com.webapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

	@GetMapping("/")
	public String index() {
		System.out.println("Mapping index page");
		/**
		 * This will download the jsp file because by default the jsp is not supported
		 * for this we need tomcat jasper dependency
		 */
		return "Welcome to Index page";
	}

	@GetMapping("/home")
	public String home() {
		System.out.println("Mapping home page");
		/**
		 * This will download the jsp file because by default the jsp is not supported
		 * for this we need tomcat jasper dependency
		 */
		return "This is Home page";
	}

}
