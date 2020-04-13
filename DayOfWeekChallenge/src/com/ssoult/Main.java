package com.ssoult;

public class Main {

    public static void main(String[] args) {


        printDayOfTheWeek(0);
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);
    }



    public static void printDayOfTheWeek(int day){

        switch (day){
            case 0:
                System.out.println("Today is Sunday!");
                break;
            case 1:
                System.out.println("Today is Monday!");
                break;
            case 2:
                System.out.println("Today is Tuesday!");
                break;
            case 3:
                System.out.println("Today is Wednesday!");
                break;
            case 4:
                System.out.println("Today is Thursday!");
                break;
            case 5:
                System.out.println("Today is Friday!");
                break;
            case 6:
                System.out.println("Today is Saturday!");
                break;
                default:
                    System.out.println("Invalid day");
                    break;
        }
        if (day == 0) {
            System.out.println("Today is Sunday!");

        }else if (day == 1){
            System.out.println("Today is Monday!");

        }else if (day == 2){
            System.out.println("Today is Tuesday!");

        }else if (day == 3){
            System.out.println("Today is Wednesday!");

        }else if (day == 4){
            System.out.println("Today is Thursday!");

        }else if (day == 5){
            System.out.println("Today is Friday!");

        }else if (day == 6){
            System.out.println("Today is Saturday!");

        }else{
            System.out.println("Invalid day");
        }
        }

}
