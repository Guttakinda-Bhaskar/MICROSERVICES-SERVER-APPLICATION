package com.example.demo.feignClient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MICROSERVICE-CLIENT-3")
public interface HiByeFeignClient {

	@GetMapping(value = "/hi/{name}")
	public String showTestController(@PathVariable("name") String name);
}
