package com.ssoult;

public class Main {

    public static void main(String[] args) {


        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
        System.out.println(getGreatestCommonDivisor(1010, 10));


    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int max;
        int min;
        if (first > second) {
            max = first;
            min = second;
        } else {
            max = second;
            min = first;
        }
        System.out.println("max = " + max + " min = " + min);
        //euclidean division
        //20 / 7  = 2 + 6;
        //7 / 6   = 1 + 1;
        //6 / 1   = 6 + 0;
        //return 6

        int dividend = min;

        if (max % min != 0) {
            int divisor = max % min;
            System.out.println("dividend = " + dividend + " divisor = " + divisor);

            if (dividend % divisor != 0) {
                int remainder = dividend % divisor;
                System.out.println("Remainder = " + remainder);
                while (remainder != 0) {
                    dividend = divisor;
                    divisor = remainder;
                    remainder = dividend % divisor;

                    System.out.println("Remainder = " + remainder);
                }
            }
            return divisor;
        }else{
            return min;
        }

    }
}
/*
*  public static int getGreatestCommonDivisor(int first, int second){

        if (first >= 10 && second >= 10) {
            int min;
            int gcd = 1;
            if (first <= second) {
                min = first;
            } else {
                min = second;
            }
            for (int i = 1; i <= min; i++) {
                if (first % i == 0 && second % i == 0) {
                    gcd = i;
                }
            }
            return gcd;
        }else{
            return -1;
        }
    }
* */
