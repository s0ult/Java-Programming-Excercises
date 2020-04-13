package com.ssoult;

import java.util.ArrayList;

public class Gearbox {

    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0,0.0);
        this.gears.add(neutral);

        for (int i = 1 ; i <= maxGears;i++){
            addGear(i,i * 5.3);
        }
    }

    public ArrayList<Gear> getGears() {
        return gears;
    }

    public int getMaxGears() {
        return maxGears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    private void addGear(int gearNumber, double ratio){
        if (gearNumber > 0 && gearNumber <= this.maxGears) {
            System.out.println("New gear created");
            this.gears.add(new Gear(gearNumber, ratio));
        }
    }public void changeGear(int newGear){
        if ( newGear > 0 && newGear <= this.maxGears && this.clutchIsIn) {
            System.out.println("Changing gear");
            this.currentGear = newGear;
        }else {
            System.out.println("GRrrrrrr");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if (clutchIsIn){
            System.out.println("Scream!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }
    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }



    private class Gear{
        private int gearNumber;
        private double ratio;


        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }




        public double driveSpeed(int revs){
            return revs * this.ratio;
        }


        public int getGearNumber() {
            return gearNumber;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
