package com.springrest.springrest.Controller;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/home")
	
	public String home() {
		return "welcome to sample webpage";
	}

}
