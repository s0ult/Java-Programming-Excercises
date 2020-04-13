package com.ssoult;

public class Main {

    public static void main(String[] args) {


        Car porsche = new Car(4,4,"gts","Vankel","brown");
        porsche.setDoors(44);
        System.out.println(porsche.getDoors());
        porsche.setModel("Carrera");
        porsche.setModel("911");
        porsche.setModel("F-50");
        System.out.println(porsche.getModel());
    }
}
