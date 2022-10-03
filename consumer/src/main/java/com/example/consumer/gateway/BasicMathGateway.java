package com.example.consumer.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "evenOdd", url="localhost:8080")
public interface BasicMathGateway {
	
	@GetMapping("/validate/prime-number")
	public String checkEvenOdd(@RequestParam(value="number") Integer number);

}
