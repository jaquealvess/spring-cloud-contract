package com.example.consumer.usecase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.consumer.gateway.BasicMathGateway;

@Component
public class BasicMathUseCase {
	
	@Autowired
	private BasicMathGateway gateway;
	
	public String checkOddAndEve(Integer number) {
		return gateway.checkEvenOdd(number);
	}

}
