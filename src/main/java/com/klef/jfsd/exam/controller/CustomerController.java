package com.klef.jfsd.exam.controller;

import com.klef.jfsd.exam.Model.Customer;
import com.klef.jfsd.exam.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PutMapping("/{id}")
    public ResponseEntity<Customer> updateCustomer(
            @PathVariable Long id,
            @RequestParam String name,
            @RequestParam String address) {
        Customer updatedCustomer = customerService.updateCustomer(id, name, address);
        return ResponseEntity.ok(updatedCustomer);
    }
}
