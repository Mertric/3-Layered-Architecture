package com.dev.demo.main.controller;


import com.dev.demo.api.Simple;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/main")
public class MainController {
	@GetMapping("hello-world")
	public Simple HelloWorld(){
		return new Simple()
				.setName("hello")
				.setValue("world");
	}
}
