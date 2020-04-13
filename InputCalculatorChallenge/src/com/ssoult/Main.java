package com.ssoult;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum     = 0;
        int counter = 0;
        int average = 0;
        while (true){
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt){
                int number = scanner.nextInt();
                sum += number;
                counter++;
                System.out.println(counter);
            }else {
                if (counter != 0) {
                    average = (int) Math.round((double) ( sum / counter ) );
                }
                break;
            }
        }
        System.out.println("SUM = "+sum+" AVG = "+average);
    }
}
