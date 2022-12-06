package com.msbahrddin.myspring_mvc.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msbahrddin.myspring_mvc.customer.Customer;
import com.msbahrddin.myspring_mvc.repo.CustomerRepo;

@Service
@Transactional
public class CustomerService {


	@Autowired
	private CustomerRepo repo;

	public CustomerService(CustomerRepo repo) {
		super();
		this.repo = repo;
	}

	public void save(Customer cus) {
		repo.save(cus);
	}

	public List<Customer> listAll() {
		return (List<Customer>) repo.findAll();
	}

	public Customer get(Long id) {
		return repo.findById(id).get();
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}
	
	public List<Customer> search(String keyword) {
	    return repo.search(keyword);
	}

}
