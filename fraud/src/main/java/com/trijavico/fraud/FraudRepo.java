package com.trijavico.fraud;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FraudRepo extends JpaRepository<FraudCheckHistory, UUID> {
}
