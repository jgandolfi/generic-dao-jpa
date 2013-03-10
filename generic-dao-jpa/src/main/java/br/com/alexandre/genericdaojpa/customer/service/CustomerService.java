package br.com.alexandre.genericdaojpa.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.alexandre.genericdaojpa.customer.dao.CustomerDAO;
import br.com.alexandre.genericdaojpa.customer.model.Customer;

@Service("customerService")
public class CustomerService {
	
	private CustomerDAO customerDAO;
	
	@Autowired
	public CustomerService(@Qualifier("customerDAO") final CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}
	
	public Customer find(final Long id) {
		return customerDAO.read(id);
	}
	
	public void save(Customer customer) {
		customerDAO.create(customer);
	}
}
