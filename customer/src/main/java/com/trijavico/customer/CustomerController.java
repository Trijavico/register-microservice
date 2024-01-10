package com.trijavico.customer;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService) {

    @PostMapping
    public ResponseEntity<String> registerCustomer(@RequestBody CustomerRequest customerRequest){
        customerService.register(customerRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body("Registro exitoso");
    }
}
