package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping(value = "/hello/{name}")
	public String hiController(@PathVariable("name") String name) {
		return "Hi " + name+ ", How are you?";
	}
}
