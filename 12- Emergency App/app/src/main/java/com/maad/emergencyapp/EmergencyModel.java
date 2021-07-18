package com.maad.emergencyapp;

public class EmergencyModel {

    private String name;
    private int picture;
    private int phoneNumber;

    public EmergencyModel(String name, int picture, int phoneNumber) {
        this.name = name;
        this.picture = picture;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getPicture() {
        return picture;
    }

    public String getName() {
        return name;
    }

}
