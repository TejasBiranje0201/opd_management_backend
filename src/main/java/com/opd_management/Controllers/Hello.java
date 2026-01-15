package com.opd_management.Controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.access.HttpStatusAccessDeniedHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
	
	@GetMapping("/get")
	public ResponseEntity<String> showHello(){
		
		String s = " hello";
		
	return new ResponseEntity<>(s,HttpStatus.OK);
		
	}

}
