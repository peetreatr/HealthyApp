package com.example.xianggangsters.healthyapp.entity;

import android.location.Address;

/*
This class implements the LicensedPharmacy entity with attributes Name,
Address, Pharmacist and distance.
 */
public class LicensedPharmacy {
    String name;
    Address address;
    String pharmacist;

    String getName(){
        return name;
    }

    String getPharmacist(){
        return pharmacist;
    }

    Address getAddress(){
        return address;
    }

    double distance(){
        double distance = 0;
        return distance;
    }

    void setLongAndLat(){

    }

}
