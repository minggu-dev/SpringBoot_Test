package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.TestVo;

@RestController
public class TestController {
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	public TestVo makeSample() {
		TestVo t1 = new TestVo();
		t1.setV1("1");
		t1.setV2("5");
		System.out.println(t1);
		return t1;
	}
}
