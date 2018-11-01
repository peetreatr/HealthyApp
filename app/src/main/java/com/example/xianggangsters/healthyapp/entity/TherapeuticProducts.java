package com.example.xianggangsters.healthyapp.entity;
/*
This class implements the TherapeuticProducts entity with attributes
licenseNumber, productName, licenseHolder, forensicClassification, atcCode,
dosageForm and routeOfAdministration
 */
public class TherapeuticProducts {
    String licenseNumber;
    String productName;
    String licenseHolder;
    String forensicClassification;
    String atcCode;
    String dosageForm;
    String routeOfAdministration;

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public String getProductName() {
        return productName;
    }

    public String getLicenseHolder() {
        return licenseHolder;
    }

    public String getForensicClassification() {
        return forensicClassification;
    }

    public String getAtcCode() {
        return atcCode;
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public String getRouteOfAdministration() {
        return routeOfAdministration;
    }
}
