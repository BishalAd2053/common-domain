# Common Domain Library

This is a framework-free Java library containing core domain primitives used across all services in the Car Services Marketplace application.

## Purpose

This library provides:
- Validated, immutable value objects (geo, money, contact, ids)
- Canonical enums (e.g., service tags)
- Validation helpers and error model
- Framework-independent domain primitives

## Key Components

### Geo
- `GeoPoint` - Immutable lat/lon coordinates with validation
- `RadiusMi` - Search radius in miles with validation

### Money
- `Money` - Amount + currency with arithmetic operations
- `CurrencyCode` - ISO currency code wrapper

### IDs
- `Id` - Base class for strongly typed IDs
- `ProviderId` - Provider-specific ID

### Service
- `ServiceTag` - Canonical enum of available car services

### Validation & Error Handling
- `Guard` - Common validation methods
- `DomainError` - Domain-level error representation

## Usage

Add the dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>com.carmarketplace</groupId>
    <artifactId>common-domain</artifactId>
    <version>1.0.0</version>
</dependency>
```

## Build & Test

Requirements:
- Java 21
- Maven 3.8+

To build and run tests:
```bash
mvn clean install
```

## Contributing

- No framework dependencies allowed
- All primitives must be immutable
- Validate inputs in constructors
- Include unit tests for all components
- Follow semantic versioning
