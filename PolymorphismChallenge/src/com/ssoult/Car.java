package com.ssoult;

public class Car {

    private String name;
    private String color;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int windows;
    private double velocity;
    private double direction;


    public Car(double direction) {
        this.direction = direction;
    }

    public Car(String name, String color, int cylinders, int windows) {
        this.name = name;
        this.color = color;
        this.cylinders = cylinders;
        this.windows = windows;

        this.wheels = 4;
        this.engine = true;
    }



    public void startEngine(){
        System.out.println("Car.startEngine() called");
        this.engine = true;
    }
    public void accelerate(int acceleration){
        if (this.velocity - acceleration > 490.48){
            this.velocity = 490.48;
            return;
        }
        this.velocity += acceleration;
    }
    public void brake(int deceleration){
        if (this.velocity - deceleration < 0){
            this.velocity = 0;
            return;
        }
        this.velocity -= deceleration;
    }

    public void changeDirection(double degrees){
        if (( this.direction + degrees ) / 360.0 > 0){
            this.direction = (( this.direction + degrees) % 360.0);
            return;
        }
        this.direction += degrees;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getVelocity() {
        return velocity;
    }

    public double getDirection() {
        return direction;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWindows() {
        return windows;
    }
}
