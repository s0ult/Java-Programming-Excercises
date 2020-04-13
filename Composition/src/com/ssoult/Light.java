package com.ssoult;

public class Light {

    private String typeOfLight;
    private String colorTemperature;
    private int amountOfBulbs;

    public Light(String typeOfLight, String color, int amountOfBulbs) {
        this.typeOfLight = typeOfLight;
        this.colorTemperature = color;
        this.amountOfBulbs = amountOfBulbs;
    }
    public void turnOnLight(){
        System.out.println("Turning on light.");
    }

    public String getTypeOfLight() {
        return typeOfLight;
    }

    public String getColorTemperature() {
        return colorTemperature;
    }

    public int getAmountOfBulbs() {
        return amountOfBulbs;
    }
}
