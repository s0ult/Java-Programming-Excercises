package com.ssoult;

public class Main {

    public static void main(String[] args) {

        int newScore = calculateScore("Stavros",500);
        System.out.println("New score is "+newScore);
        System.out.println(calculateScore(500));
        System.out.println(calculateScore());
        System.out.println(calcFeetAndInchesToCentimeters(6.123));
     }



    public static int calculateScore(String playerName, int score){

        System.out.println("Player "+ playerName +" scored "+score+" points!");

        return score * 1000;
    }

    public static int calculateScore( int score){

        System.out.println("Unnamed player scored "+score+" points!");

        return score * 1000;
    }
    public static int calculateScore(){

        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters
            (double feet, double inches){
        if (feet < 0 || (inches < 0 || inches > 12)){
            System.out.println("Invalid feet or inches!");
            return -1;
        }
        inches += (feet * 12); // convert feet to inches and add them to inches
        return inches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters
            (double inches){
        if ( inches < 0 ){
            System.out.println("Invalid inches value. Inches less than 0!");
            return -1;
        }
            double feet = Math.floor(inches / 12);

            inches %= 12;//remainder of the division of inches with 12
            System.out.println("feet = "+feet+" inches = "+inches);

        return calcFeetAndInchesToCentimeters(feet, inches);
    }
}
