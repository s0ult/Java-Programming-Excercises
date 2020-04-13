package com.ssoult;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public Car(int doors, int wheels, String model, String engine, String colour) {
        this.doors = doors;
        this.wheels = wheels;
        this.model = model;
        this.engine = engine;
        this.colour = colour;
    }

    public void setDoors(int doors){
        this.doors = doors;
    }
    public int getDoors(){
        return this.doors;
    }
    public void setWheels(int wheels){
        this.wheels = wheels;
    }

    public int getWheels(){
        return this.wheels;
    }
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("911")) {

            this.model = model;
        }else {
            this.model = "Umknown";
        }
    }
    public String getModel(){
        return this.model;
    }

}


