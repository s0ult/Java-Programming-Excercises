package com.ssoult;

public class Main {

    public static void main(String[] args) {



        HealthyBurger healthyBurger = new HealthyBurger("turkey");
        healthyBurger.setAvocado(1);
        healthyBurger.setLettuce(1);
        healthyBurger.setOnions(1);
        healthyBurger.setPrawn(1);
        System.out.println(healthyBurger.calculateTotalPrice());
        healthyBurger.showPrice();
        DeluxeHamburger deluxeBurger = new DeluxeHamburger("toasted bread","angus beef");
//        deluxeBurger.setAvocado(1);
        deluxeBurger.setLettuce(1);
        deluxeBurger.setOnions(1);
//        deluxeBurger.setPrawn(1);
//        System.out.println(deluxeBurger.calculateTotalPrice());
        deluxeBurger.showPrice();


    }
}
