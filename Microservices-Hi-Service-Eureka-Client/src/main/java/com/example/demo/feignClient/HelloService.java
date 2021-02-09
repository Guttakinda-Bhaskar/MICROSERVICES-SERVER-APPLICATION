package com.example.demo.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="HELLO-SERVICE")
public interface
HelloService {

	@GetMapping(value = "/hello/{name}")
	public String hiController(@PathVariable("name") String name);
}
