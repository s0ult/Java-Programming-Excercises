package com.ssoult;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(12));
        System.out.println(sumDigits(1));


    }

    public static int sumDigits(int number){

        if (number < 0){
            return -1;
        }

        int sum = 0;
        //125 => 125 % 10 = 5 , 125 / 10 = 12 ...
        while (number > 0){
            int digit = number % 10;
            number /= 10;
            sum += digit;
        }
        return sum;
    }
}
