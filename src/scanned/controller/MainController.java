package scanned.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import scanned.model.Customer;
import scanned.service.Service;

@Controller
public class MainController {
	@Autowired
	private Service service;
	
	@RequestMapping("/")
	public String index(){
		Customer cusomer=new Customer();
		cusomer.setFirstName("zelalem");
		cusomer.setLastName("Fikre");
		service.saveCustomer(cusomer);
		
		return "index";
	}

}
