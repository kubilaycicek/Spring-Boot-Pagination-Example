package com.kubilaycicek.demo.service;

import com.kubilaycicek.demo.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    Page<Customer> getCustomers(Integer pageSize,Integer page);
}
