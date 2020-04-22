package com.kubilaycicek.demo.service;

import com.kubilaycicek.demo.entity.Customer;
import com.kubilaycicek.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Page<Customer> getCustomers(Integer pageSize, Integer page) {
        Pageable pageable = PageRequest.of(page,pageSize);
        return customerRepository.findAll(pageable);
    }
}
