package com.carmarketplace.common.domain;

import java.util.regex.Pattern;

/**
 * Phone number in E.164 format.
 */
public record PhoneNumber(String value) {
    private static final Pattern E164 = Pattern.compile("^\\+[1-9]\\d{1,14}$");

    public PhoneNumber {
        Guard.notBlank(value, "phone number");
        if (!E164.matcher(value).matches()) {
            throw new IllegalArgumentException("invalid phone number: " + value);
        }
    }

    @Override
    public String toString() {
        return value;
    }
}
