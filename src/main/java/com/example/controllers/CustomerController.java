package com.example.controllers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
		list.add(new Customer(new Long(456), "Nolwenn Nestic"));
		list.add(new Customer(new Long(789), "Cristina Barone"));
	}
	
	//GET for REST API - CRUD Method = R = Retrieve
	//We specify the return response that produces and annotated accordingly to use the internal spring objects for conversion
	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<Customer> getCustomers() {
		return list;
	}
	
	//POST for REST API - CRUD Method = D = DELETE
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public boolean deleteCustomer(@PathVariable("id") Long id) {
		Iterator<Customer> listIterator = list.iterator();
		
		while(listIterator.hasNext()) {
			Customer currentCustomer = listIterator.next();
			
			if(currentCustomer.getId().equals(id)) {
				listIterator.remove();
				return true;
			}
		}
		
		return false;
	}
}
