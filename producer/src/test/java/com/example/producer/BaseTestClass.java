package com.example.producer;

import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.producer.entrypoint.EvenOddController;

import io.restassured.module.mockmvc.RestAssuredMockMvc;

@SpringBootTest(classes = ProducerApplication.class)
public class BaseTestClass {
	
	@Autowired
    private EvenOddController evenOddController;
	
	@BeforeEach
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(evenOddController);
    }

}
