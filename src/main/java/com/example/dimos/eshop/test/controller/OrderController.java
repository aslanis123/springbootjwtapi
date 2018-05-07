package com.example.dimos.eshop.test.controller;

import com.example.dimos.eshop.test.domain.Order;
import com.example.dimos.eshop.test.repository.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderRepo orderRepo;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<Order> findAll(){
        return orderRepo.findAll();
    }



}
