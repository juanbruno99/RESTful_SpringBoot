package com.example.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.domain.Customer;

/**
 * 
 * @author juanmarcosbruno
 *
 */

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	//Simulating datsource contents 
	private static List<Customer> list = new ArrayList<Customer>();
	
	static {
		list.add(new Customer(new Long(123), "Juan Bruno"));
		list.add(new Customer(new Long(123), "Nolwenn Nestic"));
		list.add(new Customer(new Long(123), "Cristina Barone"));
	}
	
	//GET for REST API - CRUD Method = R = Retrieve
	
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Customer> getCustomers() {
		return list;
	}
}
