package com.ssoult;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= "+circle.getRadius());
        System.out.println("circle.area= "+circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("circle.radius= "+cylinder.getRadius());
        System.out.println("circle.height= "+cylinder.getHeight());
        System.out.println("circle.area= "+cylinder.getArea());
        System.out.println("circle.volume= "+cylinder.getVolume());
    }
}
