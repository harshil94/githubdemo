package com.labt.githubdemo.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value="/hello")
	public ResponseEntity<String> hello(){
		return new ResponseEntity<String>("Hello World!",new HttpHeaders(),HttpStatus.OK);
	}
	
}
