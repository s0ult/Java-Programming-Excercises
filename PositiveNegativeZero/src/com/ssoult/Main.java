package com.ssoult;

public class Main {

    public static void main(String[] args) {


        checkInteger(1);
        checkInteger(-1);
        checkInteger(0);

    }

    public static void checkInteger( int number){

        if (number == 0){
            System.out.println("The integer number is equal to zero");
        }else if (number > 0){
            System.out.println("The number is positive");
        }else {
            System.out.println("The number is negative");
        }
    }
}
