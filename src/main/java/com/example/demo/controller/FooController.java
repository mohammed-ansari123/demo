package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Test;

@RestController
@RequestMapping("/foos")
public class FooController {

	@GetMapping
	public Test print() {
		Test test = new Test();
		test.setField1("Hello!");
		return test;
	}
}
