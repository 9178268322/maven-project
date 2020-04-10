package com.wbl.jenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsMavenBasedProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsMavenBasedProjectApplication.class, args);
	}
	
	@GetMapping(value = "/get")
	public String test() {
		return "Hello, World";
	}
	
	@GetMapping(value = "/hello")
	public String test1() {
		return "Jenkins 1";
	}

}
