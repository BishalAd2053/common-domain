package com.carmarketplace.common.domain.provider;

import com.carmarketplace.common.domain.Guard;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * A customer review of a service provider.
 */
public class Review {
    private UUID id;
    private UUID customerId;
    private int rating;
    private String comment;
    private OffsetDateTime createdAt;

    public Review(UUID id,
                  UUID customerId,
                  int rating,
                  String comment,
                  OffsetDateTime createdAt) {
        setId(id);
        setCustomerId(customerId);
        setRating(rating);
        setComment(comment);
        setCreatedAt(createdAt);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        Guard.notNull(id, "id");
        this.id = id;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        Guard.notNull(customerId, "customerId");
        this.customerId = customerId;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        Guard.inRange(rating, 1, 5, "rating must be between 1 and 5");
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        Guard.notBlank(comment, "comment");
        this.comment = comment;
    }

    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        Guard.notNull(createdAt, "createdAt");
        this.createdAt = createdAt;
    }
}
