package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestController {

	@GetMapping(value = "/hi/{name}")
	public String showTestController(@PathVariable("name") String name)
	{
		return "Hey Mr."+name+", How are you man? are you doing work?";
	}
}
