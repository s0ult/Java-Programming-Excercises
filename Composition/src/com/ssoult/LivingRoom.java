package com.ssoult;

public class LivingRoom {

    private Sofa theSofa;
    private Table theTable;
    private Chair theChair;
    private Light theLight;
    private Tv theTv;

    public LivingRoom(Sofa theSofa, Table coffeeTable, Chair theChair, Light theLight, Tv theTv) {
        this.theSofa = theSofa;
        this.theTable = coffeeTable;
        this.theChair = theChair;
        this.theLight = theLight;
        this.theTv = theTv;
    }

    public void cleanRoom(){
        System.out.println("LivingRoom.cleanRoom() called. Cleaning the room.");
        theTv.cleanTheTv();
        theSofa.tidyUpSofa();
        theTable.cleanTable();
    }

    public Sofa getTheSofa() {
        return theSofa;
    }

    public Table getTheTable() {
        return theTable;
    }

    public Chair getTheChair() {
        return theChair;
    }

    public Light getTheLight() {
        return theLight;
    }

    public Tv getTheTv() {
        return theTv;
    }
}
