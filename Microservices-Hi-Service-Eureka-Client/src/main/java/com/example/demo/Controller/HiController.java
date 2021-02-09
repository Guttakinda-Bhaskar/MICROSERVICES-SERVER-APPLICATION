package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feignClient.HelloService;

@RestController
public class HiController {
	@Autowired
	private HelloService hiController;

	@GetMapping(value = "/hi/{name}")
	public String hiController(@PathVariable("name") String name) {
		String hiController2 = hiController.hiController("bhaskaraa!");
		return "Hi " + name+" ::::::::::::::::::"+hiController2;
	}
}
