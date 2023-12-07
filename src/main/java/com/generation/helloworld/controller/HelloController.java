package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {
	
	@GetMapping
	public String Hello () {
		return "<i> <b> Hello World :D </i> </b>";			
		
	}
	// Esse é SUBCAMINHO do caminho principal que é /hello
	@GetMapping ("/bsm")
	public String bsm() {
		return "<b> Essas são as BSM's da Generation Brasil: Orientação ao futuro, Mentalidade de Crescimento, Responsabilidade Pessoal e Persistência. ";
				
	}
	
	@GetMapping ("/objetivos")
	public String objetivos() {
		return "<b> Esses são meus objetivos de aprendizagem essa semana: MySQL, Spring Boot e Métodos HTTP </b>"; 
	}
	

}
