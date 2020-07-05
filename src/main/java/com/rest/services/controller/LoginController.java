package com.rest.services.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.services.manager.UserDetailsManager;
import com.rest.services.util.RestObject;

@RestController
public class LoginController {

	@Autowired
	UserDetailsManager userDetailsManager;
	
	@RequestMapping(value = "/HelloWord", method = RequestMethod.GET, headers = "Accept=application/json")
	public RestObject getHelloWorld() {
		String message = "Hello World";
		RestObject response = new RestObject(message, 200, "Success");
		return response;
	}
	
	@RequestMapping(value = "/login/{userName}/{password}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody 
	RestObject getLoginDetails(@PathVariable String userName , @PathVariable String password) {
		
		String response="";
		if(userName.equals("sandeep088") && password.equals("Smiley1")){
			response = "true";
		}else{
			response = "false";
		}
		RestObject restObject = new RestObject(response,200,"Success");
		
		//RestObject response = new RestObject(message, 200, "Success");
		return restObject;
	}
	
	
	@RequestMapping(value = "/getUser/{userName}", method = RequestMethod.GET, headers = "Accept=application/json")
	public @ResponseBody 
	RestObject getUser(@PathVariable String userName) {
		
		String full_name = this.userDetailsManager.getUserName(userName);
		
		RestObject restObject = new RestObject(full_name,200,"Success");
		
		//RestObject response = new RestObject(message, 200, "Success");
		return restObject;
	}
	
	
}
