package com.ssoult;

public class Chair {

    private String typeOfChair;
    private String color;

    public Chair(String typeOfChair, String color) {
        this.typeOfChair = typeOfChair;
        this.color = color;
    }

    public String getTypeOfChair() {
        return typeOfChair;
    }

    public String getColor() {
        return color;
    }
}
