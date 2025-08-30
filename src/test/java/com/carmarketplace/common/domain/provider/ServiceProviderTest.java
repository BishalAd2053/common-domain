package com.carmarketplace.common.domain.provider;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class ServiceProviderTest {

    @Test
    void blankFullNameThrows() {
        BusinessDetails bd = new BusinessDetails("lic", "ins", List.of(), "tax");
        ServiceDetails sd = new ServiceDetails(UUID.randomUUID(), ServiceCategory.MAINTENANCE, "title", "desc", PriceType.FIXED, BigDecimal.ONE, List.of());
        OperationalDetails od = new OperationalDetails(LocationType.MOBILE, "addr", List.of(), Map.of(), ResponseTime.IMMEDIATE);
        Experience exp = new Experience(1, List.of(), List.of());
        MarketplaceCompliance mc = new MarketplaceCompliance(Map.of(), true, true, "id");
        Review review = new Review(UUID.randomUUID(), UUID.randomUUID(), 5, "good", OffsetDateTime.now());

        assertThrows(IllegalArgumentException.class, () ->
                new ServiceProvider(UUID.randomUUID(), " ", "p", "e", "a", "pic", "bio", bd, List.of(sd), od, exp, mc, List.of(review)));
    }

    @Test
    void createsProvider() {
        BusinessDetails bd = new BusinessDetails("lic", "ins", List.of("cert"), "tax");
        ServiceDetails sd = new ServiceDetails(UUID.randomUUID(), ServiceCategory.REPAIR, "t", "d", PriceType.HOURLY, BigDecimal.TEN, List.of());
        OperationalDetails od = new OperationalDetails(LocationType.WORKSHOP, "addr", List.of("area"), Map.of("mon", "9-5"), ResponseTime.SAME_DAY);
        Experience exp = new Experience(5, List.of("url"), List.of("ref"));
        MarketplaceCompliance mc = new MarketplaceCompliance(Map.of("acc", "123"), true, true, "id");
        Review review = new Review(UUID.randomUUID(), UUID.randomUUID(), 4, "good", OffsetDateTime.now());

        ServiceProvider provider = new ServiceProvider(UUID.randomUUID(), "John", "p", "e", "a", "pic", "bio", bd, List.of(sd), od, exp, mc, List.of(review));
        assertEquals("John", provider.getFullName());
        assertEquals(1, provider.getServices().size());
    }
}
