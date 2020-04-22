package com.kubilaycicek.demo.api;

import com.kubilaycicek.demo.entity.Customer;
import com.kubilaycicek.demo.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("customer")
@RestController
public class CustomerRestController {

    @Autowired
    public CustomerService customerService;

    @GetMapping("/list")
    public Page<Customer> getCustomers(@RequestParam Integer pageSize, @RequestParam Integer page){
        return  customerService.getCustomers(pageSize,page);
    }
}
