package com.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Controller annotation for controlling web Application page mapping
 */
@Controller
public class HomeController {

	/**
	 * @RequestMapping is a generic annotation to map the web pages to an end point
	 *                 Optional annotations which can be used:
	 * @GetMapping
	 * @PostMapping etc.
	 * 
	 * @RequestBody annotation tells that the return value is a data instead of
	 *              pointing to another resource
	 * @return
	 */

	@GetMapping("/resume")
	public String resume() {
		System.out.println("Mapping resume page");
		/**
		 * This will download the jsp file because by default the jsp is not supported
		 * for this we need tomcat jasper dependency the jsp file is read by default
		 * from src/webapp folder
		 */
		return "resume.jsp";
	}

	@RequestMapping("resume2")
	public String resumeNew() {
		System.out.println("Mapping new resume page");
		/**
		 * This will download the jsp file because by default the jsp is not supported
		 * for this we need tomcat jasper dependency
		 * 
		 * We can customize which path to check for web app pages and what files to use
		 * to view by updating application.properties in resources
		 */
		return "resume"; // search for resume file with suffix (.jsp) and prefix path (/pages/)
	}
}
