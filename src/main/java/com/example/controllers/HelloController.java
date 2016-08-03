package com.example.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("")
	@ResponseBody
	public String hello() {
		return "Hello, World!";
	}
	
	/**Following illustrates use of passed parameters to the HTTP method POST, leaving the controller mapping BUT relying on http method
	for serving this, specifying the content that consumes and as the body (see param annotation). Not http request param rather
	whole JSON body here. **/
	@RequestMapping(value = "/named", method = RequestMethod.POST, consumes = MediaType.TEXT_PLAIN_VALUE , produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public String greetings(@RequestBody String name) {
		return "Hello " + name;
	}
}
