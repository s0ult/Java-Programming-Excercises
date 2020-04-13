package com.ssoult;

public class Venneno extends Car {

    public Venneno(String color) {
        super("Venneno", color, 16, 4);
    }

    @Override
    public void accelerate(int acceleration){
        if (getVelocity() - acceleration > 430.48){
            setVelocity(430.48);
            return;
        }
        setVelocity(acceleration);
    }
}
