package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * This class is the starting point of the Spring Boot application. It provides the programmatic configuration.
 * It also, in doing so, provides the basic configuration for component scan capabilities regarding the controllers DI
 * 
 * @author juanmarcosbruno
 *
 */

@EnableAutoConfiguration
@ComponentScan("com.example")
public class App {
	
	public static void main(String args[]) {
		SpringApplication.run(App.class, args);
	}
}
