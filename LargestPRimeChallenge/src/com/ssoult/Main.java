package com.ssoult;

public class Main {

    public static void main(String[] args) {


        System.out.println(getLargestPrime(21));
    }

    public static int getLargestPrime(int number){

        if (number < 2){
            return -1;
        }

        int divider = 2;
        while (number > 1){

            if (number % divider == 0){
                number /= divider;
            }else {
                divider++;
            }
        }
        return divider;
    }
}
/*
*         public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }
        int divider = 1;
        while (number != 1) {
            for (int i = 2; i <= number; i++) {
               // System.out.println("i = " + i + " || number = " + number);

                if (number % i == 0) {
               //     System.out.println("number -> " + number + " i " + i + " number / i =" + (number / i));
                    number /= i;
                    if (i >= divider) {
                        divider = i;
                  //      System.out.println("divider = " + divider);
                        System.out.println(i +" * ");
                        i--;
                    }
                }
            }
        }
        return divider;

    }
* */