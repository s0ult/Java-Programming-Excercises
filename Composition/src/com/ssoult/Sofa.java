package com.ssoult;

public class Sofa {

    private String typeOfSofa;
    private int amountOfSeats;
    private String color;

    public Sofa(String typeOfSofa, int amountOfSeats, String color) {
        this.typeOfSofa = typeOfSofa;
        this.amountOfSeats = amountOfSeats;
        this.color = color;
    }

    public void tidyUpSofa(){
        System.out.println("Sofa.tidyUpSofa() called. Tidying up the drape and the pillows of the sofa.");

    }

    public String getTypeOfSofa() {
        return typeOfSofa;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public String getColor() {
        return color;
    }
}
