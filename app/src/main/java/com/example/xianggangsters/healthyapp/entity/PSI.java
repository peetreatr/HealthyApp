package com.example.xianggangsters.healthyapp.entity;
/*
This class implements the PSI entity with attributes name, latitude, longitude
and PSI24Hourly
 */
public class PSI {
    String name;
    double latitude;
    double longitude;
    double PSI24Hourly;

    public String getName() {
        return name;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getPSI24Hourly() {
        return PSI24Hourly;
    }

    double healthEffect(){
        double healthEffect = 0;
        return healthEffect;
    }

    double distance(){
        double distance = 0;
        return distance;
    }

    void operation(){

    }

    String precaution(){
        String precaution = "";
        return precaution;
    }
}
