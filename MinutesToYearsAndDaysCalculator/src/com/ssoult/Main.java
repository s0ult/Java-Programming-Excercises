package com.ssoult;

public class Main {

    public static void main(String[] args) {


        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(525600);



    }

    public static void printYearsAndDays(long minutes){

        if (minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        long startingMinutes = minutes;
        long hours = minutes / 60;
        minutes %= 60;
        long days = hours /24;
        hours %= 24;
        long years = days / 365;
        days %= 365;

        System.out.println(startingMinutes+" min = "+years+" y and "
                +days+" d");
    }


}












/* public static void printYearsAndDays(long minutes){
        if (minutes <0){

            System.out.println("Invalid Value");
        }else {
            long hours = minutes / 60;
            long days = hours / 24;
            long years = days / 365;
            days = days % 365;

            System.out.println(minutes + " min = " +
                    +years + " y and " + days + " d");
        }
    }*/
