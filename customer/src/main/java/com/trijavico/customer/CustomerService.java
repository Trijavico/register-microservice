package com.trijavico.customer;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public record CustomerService(
        CustomerRepo customerRepo,
        RestTemplate restTemplate
) {

    public void register(CustomerRequest customerRequest){
        Customer customer = new Customer(
                customerRequest.firstName(),
                customerRequest.lastName(),
                customerRequest.email()
        );
        customerRepo.saveAndFlush(customer);
        FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                "http://FRAUD/api/v1/fraud-check/{customerId}",
                FraudCheckResponse.class,
                customer.getId()
        );

        assert fraudCheckResponse != null;
        if(fraudCheckResponse.isFraudster()){
            throw new IllegalStateException("fraudster");
        }
    }
}
