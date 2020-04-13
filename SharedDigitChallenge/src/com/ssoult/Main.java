package com.ssoult;

public class Main {

    public static void main(String[] args) {

//        System.out.println(hasSharedDigit(19,99));
//        System.out.println(hasSharedDigit(9,99));
//        System.out.println(hasSharedDigit(119,100));
//        System.out.println(hasSharedDigit(15,55));
        System.out.println(hasSharedDigit(12,13));

    }
    public static boolean hasSharedDigit(int first, int second){
        if (first < 10 || first > 99 || second < 10 || second > 99){
            return false;
        }
        int tempFirst = first;
        int tempSecond = second;
        while (first > 0){

            int firstNumberDigit = first % 10;
            while (second > 0){

                int secondNumberDigit = second % 10;
                if (firstNumberDigit == secondNumberDigit){
                    return true;
                }
                second /= 10;
                System.out.println(second);
            }
            second = tempSecond;
            first /= 10;
        }

        return false;
    }
}

/*
*    public static boolean hasSharedDigit(int num1,int num2){
    if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)){

        int num1Digit;
        int num2Digit;

        int temp2 = num2;

        while (num1 > 0){
            num1Digit = num1 % 10;
           while (temp2 > 0){
                num2Digit = temp2 % 10;
                if (num1Digit == num2Digit){
                    return true;
                }
                temp2 = temp2 /10;
            }
            temp2 = num2;
            num1 = num1 / 10;
        }
        return false;
    }else {
        return false;
    }
    }
* */
