package com.danech.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	public ResponseEntity<String> welcome(){
		return ResponseEntity.ok().body("Hello Spring Boot From Jenkins CICD");
	}
}
