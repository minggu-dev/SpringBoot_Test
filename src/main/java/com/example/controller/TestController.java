package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.Memos;
import com.example.service.TestService;

@RestController
public class TestController {
	@Autowired
	TestService service;
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello World!";
	}
	
	@RequestMapping("/test")
	public List<Memos> makeSample() {
		List<Memos> list = service.selectList();
		return list;
	}
}
