package com.ssoult;

public class Main {

    public static void main(String[] args) {

        //hint 1 pound = 0.45359237 kilograms
        //1 pound -> 0.45359237 kilograms
        // x pounds -> 75.6 kg


        double myWeightInKilograms =  75.6;

        double myWeightInPounds    =  (myWeightInKilograms / 0.45359237);

        System.out.println("My weight in pounds = " + Math.round(myWeightInPounds));

        double anotherNumber = 3_0.4567_890d;

        System.out.println(anotherNumber);
    }
}
