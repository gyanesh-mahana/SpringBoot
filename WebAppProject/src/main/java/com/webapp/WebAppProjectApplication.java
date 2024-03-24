package com.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebAppProjectApplication {

	public static void main(String[] args) {
		/**
		 * One issue here is the tomcat server is embedded server and every time the
		 * project is restarted it will start a new tomcat server
		 */
		SpringApplication.run(WebAppProjectApplication.class, args);
	}

}
