package com.trijavico.customer;

public record CustomerRequest(
        String firstName,
        String lastName,
        String email
) {
}
