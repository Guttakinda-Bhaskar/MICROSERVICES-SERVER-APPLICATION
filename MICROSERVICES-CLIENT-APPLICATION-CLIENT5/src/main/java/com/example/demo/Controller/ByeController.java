package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.feignClient.HiByeFeignClient;

@RestController
@RequestMapping("/")
public class ByeController {

	@Autowired
	public HiByeFeignClient hiByeFeignClient;
	
	@GetMapping(value = "/bye/{name}")
	public String showByeController(@PathVariable("name") String name)
	{
		String showTestController = hiByeFeignClient.showTestController("Vinay");
		return "Bye!!! Controller"+name+"With feign Client"+showTestController;
	}
}
