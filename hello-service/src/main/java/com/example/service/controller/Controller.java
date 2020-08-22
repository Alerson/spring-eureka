package com.example.service.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.model.HelloObject;

@RestController
public class Controller {

	private AtomicLong counter = new AtomicLong();

	@GetMapping("/hello")
	public HelloObject getHelloWorldObject() {
		HelloObject hello = new HelloObject();
		hello.setMessage("Hi there! You are number " + counter.incrementAndGet());
		return hello;
	}
}
