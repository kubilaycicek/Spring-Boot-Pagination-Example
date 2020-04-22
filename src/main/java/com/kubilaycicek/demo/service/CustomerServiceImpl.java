package com.kubilaycicek.demo.service;

import com.kubilaycicek.demo.entity.Customer;
import com.kubilaycicek.demo.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;
    private Pageable pageable;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Page<Customer> getCustomers(Integer pageSize, Integer page) {
        pageable = PageRequest.of(page,pageSize);
        return customerRepository.findAll(pageable);
    }

    @Override
    public Slice<Customer> getCustomersWithSlice(Integer pageSize, Integer page) {
        pageable = PageRequest.of(page,pageSize);;
        return customerRepository.findAll(pageable);
    }
}
