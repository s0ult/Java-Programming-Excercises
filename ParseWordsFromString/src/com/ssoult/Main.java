package com.ssoult;

public class Main {

    public static void main(String[] args) {


        String numberAsString = "2010";
        System.out.println("numberAsString = "+ numberAsString);
        int number = Integer.parseInt(numberAsString);
        System.out.println("number = "+number);
        number += 1;
        numberAsString += 1;
        System.out.println("number = "+number);
        System.out.println("numberAsString = "+ numberAsString);

    }
}
