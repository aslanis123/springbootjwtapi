package com.example.dimos.eshop.test.controller;

import com.example.dimos.eshop.test.domain.WeightLimit;
import com.example.dimos.eshop.test.repository.WeightLimitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/weightslimit")
public class WeightLimitController {

    @Autowired
    private WeightLimitRepo weightLimitRepo;

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<WeightLimit> findAll() {
        return weightLimitRepo.findAll();
    }
}
