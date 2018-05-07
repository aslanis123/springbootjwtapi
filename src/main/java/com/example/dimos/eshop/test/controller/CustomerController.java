package com.example.dimos.eshop.test.controller;

import com.example.dimos.eshop.test.domain.Customer;
import com.example.dimos.eshop.test.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerRepo customerRepo;

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN') or hasAnyAuthority('ROLE_CLIENT')")
    @ResponseBody
    public List<Customer> findAll(){
        return customerRepo.findAll();
    }

    @RequestMapping(value = "/{id}" ,method = RequestMethod.GET)
    @PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
    @ResponseBody
    public Customer findById(@PathVariable Integer id){
        return customerRepo.findById(id);
    }


}
