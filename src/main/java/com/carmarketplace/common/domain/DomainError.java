package com.carmarketplace.common.domain;

/**
 * Lightweight error representation for domain operations.
 */
public record DomainError(String code, String message) {
    public DomainError {
        Guard.notBlank(code, "code");
        Guard.notBlank(message, "message");
    }
}
