package com.ssoult;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println(getName()+" not very good at flying, swimming instead");
    }
}
