package com.example.xianggangsters.healthyapp.entity;
/*
This class implements the PM25 entity with attributes name, latitude,
longitude and pm25OneHourly.
 */
public class PM25 {
    String name;
    double latitude;
    double longitude;
    double pm25OneHourly;

    String getName(){
        return name;
    }

    double getLatitude(){
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getPm25OneHourly() {
        return pm25OneHourly;
    }

    String safetyLevels(){
        String safetyLevels = "high";
        return safetyLevels;
    }

    String healthEffects(){
        String healthEffects = "high";
        return healthEffects;
    }

    float distance(){
        float distance = 0;
        return distance;
    }


}
