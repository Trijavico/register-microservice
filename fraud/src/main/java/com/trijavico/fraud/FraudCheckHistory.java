package com.trijavico.fraud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
public class FraudCheckHistory {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO
    )
    private UUID id;
    private UUID customerId;
    private Boolean isFraudster;
    @CreationTimestamp
    private LocalDateTime createdAt;

    public FraudCheckHistory(UUID customerId, Boolean isFraudster) {
        this.isFraudster = isFraudster;
        this.customerId = customerId;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }


    public UUID getCustomerId() {
        return this.customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }


    public Boolean getIsFraudster() {
        return isFraudster;
    }

    public void setLastName(Boolean isFraudster) {
        this.isFraudster = isFraudster;
    }


    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + customerId + '\'' +
                ", lastName='" + isFraudster + '\'' +
                ", email='" + createdAt + '\'' +
                '}';
    }


}
