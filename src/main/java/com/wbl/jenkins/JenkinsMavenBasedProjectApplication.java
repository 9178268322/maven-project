package com.wbl.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsMavenBasedProjectApplication extends SpringBootServletInitializer{

	public static void main(final String[] args) {
		SpringApplication.run(JenkinsMavenBasedProjectApplication.class, args);
	}
	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(JenkinsMavenBasedProjectApplication.class);
	    }
	
	@GetMapping(value = "/get")
	public String test() {
		return "Hello, World";
	}

}
