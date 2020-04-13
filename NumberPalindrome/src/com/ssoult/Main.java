package com.ssoult;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(11211));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(7));


    }

    public static boolean isPalindrome(int number){

        int reverse = 0;
        int numberTempValue = number;
        while (numberTempValue != 0){
            reverse *= 10;

            int digit = numberTempValue % 10;
            numberTempValue /= 10;

            reverse += digit;
        }
        if (number == reverse){
            return true;
        }
        return false;
    }
}
/*
*       public static boolean isPalindrome(int number){

        int reverse = 0;
        int c = number;

        while(c > 0 || c < 0){
            reverse = reverse * 10;
            int lastDigit = c % 10;
            reverse += lastDigit;
            c = c / 10;
        }
        if (number == reverse){
           // System.out.println(number + " number , reverse = "+reverse);
            return true;
        }else {
           // System.out.println(number + " number , reverse = " + reverse);
            return false;
        }
    }

* */