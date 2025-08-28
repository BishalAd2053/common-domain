package com.carmarketplace.common.domain;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * URL value object ensuring valid URI syntax.
 */
public record UrlString(String value) {
    public UrlString {
        Guard.notBlank(value, "url");
        try {
            new URI(value);
        } catch (URISyntaxException ex) {
            throw new IllegalArgumentException("invalid url: " + value, ex);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
