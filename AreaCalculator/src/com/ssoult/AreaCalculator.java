package com.ssoult;

public class AreaCalculator {

    public static void main(String[] args) {

    }

    public static double area(double radius){

        if (radius < 0){
            return -1;
        }
        return Math.pow(radius,2) * Math.PI;
    }
    public static double area(double x, double y){
        if (x < 0 || y < 0){
            //System.out.println("X or y less than 0");
            return -1;
                    }
        return x * y;
    }

/*
*     public static final double PI = 3.14159;
    public static double area(double radius){
        if (radius <0){
            return -1.0;
        }
        return (radius * radius) * PI;
    }
    public static double area(double x, double y){
        if (x<0 ||y<0) {
            return -1;
        }
        return x*y;
    }*/
}
