package com.ssoult;

public class Main {

    public static void main(String[] args) {


        System.out.println(isPerfectNumber(28));

    }

    public static boolean isPerfectNumber(int number){

        if (number < 1){
            return false;
        }

        int sum = 0;
        for (int i = 1; i  <= number; i++){
            System.out.println("number = "+number+" i = "+i);
            if (number % i == 0 ){
                System.out.println(i);
                sum += i;
                System.out.println(number);
                number /= i;
                System.out.println(number);
            }
        }
        System.out.println(sum+" sum "+number+" number");
        if (sum == number){
            return true;
        }
        return false;

    }
}
/*
*  public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (number == sum){
            return  true;
        }else {
            return false;
        }
* */