package com.in07minutes.restful_webservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	public String getHelloWorld() {
		return "Hello World!!";
	}

	@GetMapping("/hello-world-string")
	public String getHelloWorldString() {
		return "Hello World String!!";
	}
	
	@GetMapping("/hello-world-bean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello World Bean!!");
	}
	
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean getHelloWorldBean(@PathVariable("name") String n) {
		 
		//return new HelloWorldBean("Hello World, "+ name);
		 return new HelloWorldBean(String.format("Hello World %s", n));
	}
}
