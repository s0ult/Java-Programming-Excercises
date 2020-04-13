package com.ssoult;

public class Main {

    public static void main(String[] args) {


        int count = 0;
        int sum = 0;
        int i = 0;
        while (count <= 5) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println("Sum is " + sum);
                System.out.println("Count value is = " + count);
            }
            i++;
        }
        count = 0;
        i = 0;
        do {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println("Sum is " + sum);
                System.out.println("Count value is = " + count);
            }
            i++;
        } while (count <= 5);

        System.out.println("**********");
        int evenNumbersFound = 0;
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {

            if (isEvenNumber(number)) {
                System.out.println(number + " is an even number!");
                evenNumbersFound++;
            }/*else {
                System.out.println(number+" is NOT an even number!");
            }*/
            if (evenNumbersFound == 5) {
                break;
            }
            number++;
        }
        System.out.println("Found a total of " + evenNumbersFound + " even numbers");

        for (int j = 0; j <= 5; j++) {
            System.out.println(j);
        }
        int j = 0;
        while (j <=5){
            System.out.println(j);
            j++;
        }
    }
    public static boolean isEvenNumber(int number){

         if( number < 0){
             return false;
         }//a negative number can't be even
         if (number % 2 == 0){
             return true;
         }//if it's divisible by 2 it is an even number
         return false;
         //if it is not divisible by 2 it is not
    }
}
