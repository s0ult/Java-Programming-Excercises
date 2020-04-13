package com.ssoult;

public class Main {

    public static void main(String[] args) {

        Car aCar = new Car(45.1);
        System.out.println(aCar.getDirection());

        aCar.changeDirection(360.9);
        System.out.println(aCar.getDirection());
        Venneno myVenneno = new Venneno("orange");
        myVenneno.setVelocity(1260);
        myVenneno.accelerate(600);
        System.out.println(myVenneno.getVelocity());
    }
}
