package com.ssoult;

public class Main {

    public static void main(String[] args) {


        int value = 1;

        if (value == 1) {
            System.out.println("Value was 1");
        } else if (value == 2) {
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was not 1 or 2");
        }

        int switchValue = 1;
        switch (switchValue) {

            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }
        char charValue = 'F';

        switch(charValue){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue+ " was found");
                break;
                default:
                    System.out.println("Could not find A,B,C,D or E");
                break;
        }

        String month = "January";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
                default:
                    System.out.println("Not sure");
        }

    }
}
