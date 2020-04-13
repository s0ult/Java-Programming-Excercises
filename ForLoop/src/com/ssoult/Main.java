package com.ssoult;

public class Main {

    public static void main(String[] args) {



        for (int i = 2; i <= 8; i++){

            System.out.println("10.000 at " + i + "% interest = "+String.format("%.2f",calculateInterest(10_000.0,i)));

        }
        for (int i = 8; i >= 2; i--){

            System.out.println("10.000 at " + i + "% interest = "+String.format("%.2f",calculateInterest(10_000.0,i)));

        }
        for(int i = 0; i <= 27; i++){
            isPrime(i);
        }
    }

    public static double calculateInterest(double amount, double interestRate){

        return (amount * (interestRate / 100));
    }
    public static boolean isPrime(int n){

        if (n <= 1){
            return false;
        }
        System.out.println("-------"+n+"--------");
        for (int i = 2; i <= Math.sqrt(n); i++){
            System.out.println(n + "  % "+i+" = "+(n % i));
            if (n % i == 0){
                return false;
            }
        }
        System.out.println(n+" is prime");
        return true;
    }
}
