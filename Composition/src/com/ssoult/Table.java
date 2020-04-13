package com.ssoult;

public class Table {

    private String typeOfTable;
    private int amountOfSeats;
    private String color;

    public Table(String typeOfTable, int amountOfSeats, String color) {
        this.typeOfTable = typeOfTable;
        this.amountOfSeats = amountOfSeats;
        this.color = color;
    }
    public void cleanTable(){
        System.out.println("Table.cleanTable() called. Cleaning the table.");
    }

    public String getTypeOfTable() {
        return typeOfTable;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public String getColor() {
        return color;
    }
}
