package com.asl.pcf.test.app.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.asl.pcf.test.app.model.Customer;

@RestController
public class CustomerController {
	
@PostMapping(path = "/saveCustomer")
public String getCustomerInfo(@RequestBody Customer aCustomer) {
	
	String lsMessage =      "\n Customer ID 		-> "+ aCustomer.getCustNo();
	lsMessage = lsMessage + "\n Customer Name 		-> "+ aCustomer.getName();
	lsMessage = lsMessage + "\n Customer Country   	-> "+ aCustomer.getCountry();
	lsMessage = lsMessage + "\n Customer Zipcode   	-> "+ aCustomer.getZipCode();
	return lsMessage;
}

}
