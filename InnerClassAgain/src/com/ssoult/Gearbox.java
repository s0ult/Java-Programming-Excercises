package com.ssoult;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private Gear currentGear;
    private int maxGears;
    private boolean clutchIsIn;

    public Gearbox(int maxGears,double ratio) {
        this.maxGears = maxGears;
        this.clutchIsIn = false;
        this.gears = new ArrayList<Gear>();
        for (int i = 0 ; i < maxGears; i ++){

            addGear(i, i * ratio);
        }
//        this.currentGear = gears.get(0);
        this.currentGear = gears.get(0);
    }

    public ArrayList<Gear> getGears() {
        return gears;
    }

    public Gear getCurrentGear() {
        return currentGear;
    }

    public int getGearNumber(){
        return this.currentGear.getGearNumber();
    }

    public int getMaxGears() {
        return maxGears;
    }

    public boolean isClutchIsIn() {
        return clutchIsIn;
    }

    public void setClutchIsIn(boolean in) {
        this.clutchIsIn = in;
    }

    public boolean addGear(int number, double ratio){
        if (number >= 0 && number < this.maxGears){
            this.gears.add(new Gear(number,ratio));
            return true;
        }
        return false;
    }

    public boolean changeGear(int gearNumber){
        if (clutchIsIn && gearNumber >= 0 && gearNumber <= maxGears ){
            this.currentGear = gears.get(gearNumber);
            System.out.println("Gear "+gearNumber+" inserted.");
            return true;
        }else {
            this.currentGear = gears.get(0);
            System.out.println("Grind!!");
            return false;
        }
    }

    public double speed(double revs){
        if (!clutchIsIn){
            System.out.println("Scrrrrrrr.");
            return 0.0;
        }
        return revs * gears.get(currentGear.gearNumber).getRatio();
    }

     class Gear{
        private int gearNumber;
        private double ratio;

        private Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }

        private double driveSpeed(double revs){
            return this.ratio * revs;
        }

         public double getRatio() {
             return ratio;
         }

         public int getGearNumber() {
             return gearNumber;
         }
     }
}
