package com.ssoult;

public class Main {

    public static void main(String[] args) {


        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));

        System.out.println(isValid(10));
        System.out.println(isValid(468));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int first, int second, int third){

     if (!isValid(first) || !isValid(second) || !isValid(third)){
         return false;
     }
     int firstLastDigit  = first  % 10;
     int secondLastDigit = second % 10;
     int thirdLastDigit  = third  % 10;

     if (firstLastDigit == secondLastDigit || firstLastDigit == thirdLastDigit
     || secondLastDigit == thirdLastDigit){
         return true;
     }

     return false;

    }
    public static boolean isValid(int number){
        if (number < 10 || number > 1000){
            return false;
        }
        return true;
    }
}
/*
* public static boolean hasSameLastDigit(int num1,int num2,int num3){

        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)){

            int lastDigit1 = num1 % 10;
            int lastDigit2 = num2 % 10;
            int lastDigit3 = num3 % 10;
            if (lastDigit1 == lastDigit2 || lastDigit1 == lastDigit3 || lastDigit2 == lastDigit3){

                return true;
            }else {
                return false;
            }

        }
        return false;
    }
* */
