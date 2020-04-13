package com.ssoult;

public class Main {

    public static void main(String[] args) {


        numberToWords(123000);

    }
    public static void numberToWords(int number){

        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);

        for (int i = 1; i <= getDigitCount(number); i++) {

            int digit = reversedNumber % 10;

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber /= 10;
        }
    }
    public static int getDigitCount(int number){

        if (number == 0){
            return 1;
        }
        if (number < 0){
            return -1;
        }
        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
    public static int reverse(int number){

        int reversedNumber = 0;
        while (number != 0){
            reversedNumber *= 10;
            reversedNumber += number % 10;
            number /= 10;
        }
        return reversedNumber;
    }
}

/*
*         public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        } else {
            int digit;
            int reversedNum = reverse(number);
            int tempReversed = reversedNum;
            while (reversedNum > 0) {
                digit = reversedNum % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reversedNum /= 10;
            }
            while (getDigitCount(number) > getDigitCount(tempReversed)) {
                tempReversed *= 10;
                System.out.println("Zero");

            }
        }
    }

    public static int reverse(int number) {
        int reverseNum = 0;
        int digit;
        while (number != 0) {
            digit = number % 10;
            reverseNum *= 10;
            reverseNum = reverseNum + digit;
            number /= 10;
        }
        return reverseNum;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }
        int count = 0;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
* */