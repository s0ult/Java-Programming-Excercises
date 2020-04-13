package com.ssoult;

public class Tv {

    private String manufacturer;
    private String model;
    private int inches;
    private Resolution resolution;


    public Tv(String manufacturer, String model, int inches, Resolution resolution) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.inches = inches;
        this.resolution = resolution;
    }

    public void cleanTheTv(){

        System.out.println("Tv.cleanTheTv() called. Dusting off the television.");
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getInches() {
        return inches;
    }

    public Resolution getResolution() {
        return resolution;
    }
}
