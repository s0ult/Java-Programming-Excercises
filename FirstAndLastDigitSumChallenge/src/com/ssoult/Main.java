package com.ssoult;

public class Main {

    public static void main(String[] args) {


        System.out.println(sumFirstAndLastDigit(-3309));
    }

    public static int sumFirstAndLastDigit(int number){

        if (number < 0 ){
            return -1;
        }

        int firstDigit = number % 10;
        int lastDigit = 0;
        while (number != 0){

            if (number / 10 == 0){
                lastDigit = number;
            }

            number /= 10;

        }
        return firstDigit + lastDigit;
    }
}

/*
* public static int sumFirstAndLastDigit(int number){

        if (number == 0 ){
            return -1;
        }

        number = Math.abs(number);
        //get the absolute value
        int firstDigit = 0;int lastDigit = 0;
        boolean flag = false;
        while (number != 0){
            if (flag == false){
                firstDigit = number % 10;
                flag = true;
            }
            if (number / 10 == 0){
                lastDigit = number % 10;
            }
            number /= 10;
        }

        System.out.println(lastDigit);
        System.out.println(firstDigit);
        return firstDigit + lastDigit;
    }
* */

/*
* public static int sumFirstAndLastDigit(int number) {

        if (number < 0) {
            return -1;
        }
        int firstDigit = 0;
        int lastDigit = number % 10;
        while (number >0) {
            if (number / 10 == 0) {
                firstDigit = number;
            }
            number = number / 10;
        }
        return firstDigit + lastDigit;
    }
* */