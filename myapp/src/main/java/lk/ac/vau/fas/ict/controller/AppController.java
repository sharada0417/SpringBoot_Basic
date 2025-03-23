package lk.ac.vau.fas.ict.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
	@GetMapping("/msg")
	public String myMessage(){
		return "Hello SpringBoot";
	}
	
	@GetMapping("/name")
	public String myName(){
		return "Hello My name is SpringBoot";
	}
	
	@GetMapping("/age")
	public String myAge(){
		return "Hello My age is 23";
	}
	
	@GetMapping("/regno")
	public String myRegNo(){
		return "Hello My reg no is 51";
	}
}
