package com.kubilaycicek.demo.service;

import com.kubilaycicek.demo.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

public interface CustomerService {
    Page<Customer> getCustomers(Integer pageSize,Integer page);
    Slice<Customer> getCustomersWithSlice(Integer pageSize, Integer page);
}
