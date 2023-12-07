package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {
	
	@GetMapping
	public String Hello () {
		return "<i> <b> Hello Turma 68!!! </i> </b>";			
		
	}
	// Esse é SUBCAMINHO do caminho principal que é /hello
	@GetMapping ("/top")
	public String top() {
		return "<i> <b> Turma 68 é TOP!!! </i> </b>";
	}
	

}
