package com.ssoult;

public class Circle {

    private double radius;

    public Circle(double radius) {

        if (radius >= 0) {
            this.radius = radius;
        }else{
            this.radius = 0;
        }
    }

    public double getRadius(){
        return this.radius;
    }
    public double getArea(){

        return ( Math.pow(this.radius,2) * Math.PI );
    }


}
