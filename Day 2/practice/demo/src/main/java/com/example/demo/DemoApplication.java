package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
// notacion, fragmentos de codigo que puedes utilizar en tu clase, resumir codigo
@SpringBootApplication
@RestController
public class DemoApplication {

	@RequestMapping(path = "/hello",  method = RequestMethod.GET)
	String home() {
		return "Hello World!";
	}

	// /hello/jhonny -> "Hello jhonny"
	@RequestMapping(path = "/hello/{name}",  method = RequestMethod.GET)
	String home1(@PathVariable String name)
	{
		return "Hello " + name;
	}

	// /hello/spring ->  "I am in the spring course"
	@RequestMapping(path = "/hello/spring",  method = RequestMethod.GET)
	String home2()
	{
		return "I am in the spring course";
	}


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
