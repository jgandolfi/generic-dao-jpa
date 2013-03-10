package br.com.alexandre.genericdaojpa.customer.dao;

import org.springframework.stereotype.Repository;

import br.com.alexandre.genericdaojpa.customer.model.Customer;
import br.com.alexandre.genericdaojpa.dao.AbstractDAO;

@Repository("customerDAO")
public class CustomerDAOImpl extends AbstractDAO<Customer, Long> implements CustomerDAO {
}
