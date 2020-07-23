package com.openshift.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftDemoApplication {

	@GetMapping("/")
	public String welcome(){
		return "Welcome ......";
	}
	
	@GetMapping("/{input}")
	public String welcome(@PathVariable String input){
		return "Welcome .....with path variable." + input;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(OpenshiftDemoApplication.class, args);
	}

}
