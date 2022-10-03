package com.example.consumer.entrypoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumer.usecase.BasicMathUseCase;

@RestController
public class BasicMathController {
	
	@Autowired
	private BasicMathUseCase useCase;

    @GetMapping("/calculate")
    public String checkOddAndEven(@RequestParam("number") Integer number) {
        return useCase.checkOddAndEve(number);
    }

}
