package com.carmarketplace.common.domain.provider;

import com.carmarketplace.common.domain.Guard;
import java.util.List;
import java.util.Map;

/**
 * Operational characteristics of a service provider.
 */
public class OperationalDetails {
    private LocationType locationType;
    private String workshopAddress;
    private List<String> coverageArea;
    private Map<String, String> operatingHours;
    private ResponseTime responseTime;

    public OperationalDetails(LocationType locationType,
                              String workshopAddress,
                              List<String> coverageArea,
                              Map<String, String> operatingHours,
                              ResponseTime responseTime) {
        setLocationType(locationType);
        setWorkshopAddress(workshopAddress);
        setCoverageArea(coverageArea);
        setOperatingHours(operatingHours);
        setResponseTime(responseTime);
    }

    public LocationType getLocationType() {
        return locationType;
    }

    public void setLocationType(LocationType locationType) {
        Guard.notNull(locationType, "locationType");
        this.locationType = locationType;
    }

    public String getWorkshopAddress() {
        return workshopAddress;
    }

    public void setWorkshopAddress(String workshopAddress) {
        Guard.notBlank(workshopAddress, "workshopAddress");
        this.workshopAddress = workshopAddress;
    }

    public List<String> getCoverageArea() {
        return coverageArea;
    }

    public void setCoverageArea(List<String> coverageArea) {
        Guard.notNull(coverageArea, "coverageArea");
        this.coverageArea = List.copyOf(coverageArea);
    }

    public Map<String, String> getOperatingHours() {
        return operatingHours;
    }

    public void setOperatingHours(Map<String, String> operatingHours) {
        Guard.notNull(operatingHours, "operatingHours");
        this.operatingHours = Map.copyOf(operatingHours);
    }

    public ResponseTime getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(ResponseTime responseTime) {
        Guard.notNull(responseTime, "responseTime");
        this.responseTime = responseTime;
    }
}
