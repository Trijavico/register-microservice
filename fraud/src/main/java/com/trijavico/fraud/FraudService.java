package com.trijavico.fraud;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public record FraudService(FraudRepo fraudRepo) {

    public Boolean isFraudulentCustomer(UUID customerId){
        FraudCheckHistory fraudCheckHistory = new FraudCheckHistory(customerId, false);
        fraudRepo.save(fraudCheckHistory);
        return false;

    }

}
