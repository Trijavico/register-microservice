package com.trijavico.fraud;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/fraud-check")
public record FraudCheckController(FraudService fraudService) {

    @GetMapping(path = "{customerId}")
    public ResponseEntity<FraudCheckResponse> isFraudster(@PathVariable("customerId") UUID customerId){
        Boolean isFraudulent = fraudService.isFraudulentCustomer(customerId);
        return ResponseEntity.status(HttpStatus.OK).body(new FraudCheckResponse(isFraudulent));
    }

}
