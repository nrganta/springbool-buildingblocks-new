package com.stacksimply.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Simple Method
@RestController
public class HelloWorldController {
	
	//simple method
	//uri /helloworld
	//GET 
	//@RequestMapping(method=RequestMethod.GET,path="/helloworld")
	@GetMapping("/helloworld1")
	public String HelloWorld()
	{
		return "HelloWorld";
	}
    @GetMapping("/helloWorldBean")
	public UserDetails helloWorldBean()
	{
		return new UserDetails("Nag","Ganta","Hyderabd");
	}
}
