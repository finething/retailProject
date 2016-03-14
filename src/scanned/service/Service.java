package scanned.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import scanned.model.Customer;
import dao.Dao;

@org.springframework.stereotype.Service
public class Service {
	@Autowired
	private Dao dao;
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public boolean saveCustomer(Customer customer){
		boolean returnValue=false;
		dao.saveCustomer(customer);
		return returnValue;
		
	}

}
