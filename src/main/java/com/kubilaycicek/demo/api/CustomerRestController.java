package com.kubilaycicek.demo.api;

import com.kubilaycicek.demo.entity.Customer;
import com.kubilaycicek.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Slice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("customer/")
@RestController
public class CustomerRestController {

    private CustomerService customerService;
    public CustomerRestController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("list")
    public Page<Customer> getCustomersWithPage(@RequestParam(name = "pageSize") Integer pageSize, @RequestParam(name = "page") Integer page){
        return  customerService.getCustomers(pageSize,page);
    }

    @GetMapping("list/slice")
    public Slice<Customer> getCustomersWithSlice(@RequestParam(name = "pageSize") Integer pageSize, @RequestParam(name = "page") Integer page){
        return customerService.getCustomers(pageSize,page);
    }
}
