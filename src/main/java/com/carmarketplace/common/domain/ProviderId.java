package com.carmarketplace.common.domain;

import java.util.UUID;

/**
 * Identifier for providers.
 */
public final class ProviderId extends Id<UUID> {
    public ProviderId(UUID value) {
        super(value);
    }

    public static ProviderId random() {
        return new ProviderId(UUID.randomUUID());
    }
}
