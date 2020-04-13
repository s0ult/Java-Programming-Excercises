package com.ssoult;

public class Main {

    public static void main(String[] args) {


        Dog corgi = new Dog("Corgster");

        System.out.println(corgi.getName());
        corgi.breathe();
        corgi.eat();

        Parrot parrot = new Parrot("Polytelini");

        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");

        penguin.fly();



    }
}
