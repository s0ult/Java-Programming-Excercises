package com.ssoult;

public class Main {

    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number){

        //System.out.println("Number = "+number);
        if (number < 0){
            return -1;
        }

        int sum = 0;
        while (number != 0){

            int digit = number % 10;
            //System.out.println("Digit = "+digit);
            if (digit % 2 == 0 ){
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }
}
/*
* public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }
        int temp;
        int sum = 0;
        while (number > 0) {
            temp = number % 10;
            if (temp % 2 == 0) {
                sum += temp;
                System.out.println(sum);
            }
            number = number / 10;
        }
        return sum;
    }
* */
