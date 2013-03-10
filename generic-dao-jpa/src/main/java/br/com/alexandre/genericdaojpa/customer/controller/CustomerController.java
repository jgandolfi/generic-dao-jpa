package br.com.alexandre.genericdaojpa.customer.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alexandre.genericdaojpa.customer.model.Customer;
import br.com.alexandre.genericdaojpa.customer.service.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	@Qualifier("customerService")
	private CustomerService customerService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    final DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	@RequestMapping(value="/novo.html", method=RequestMethod.GET)
	public String novo() {
		return "cadastro";
	}
	
	@RequestMapping(value="/salvar.html", method=RequestMethod.POST)
	public String salvar(Customer customer) {
		customerService.save(customer);
		return "sucesso";
	}
}
