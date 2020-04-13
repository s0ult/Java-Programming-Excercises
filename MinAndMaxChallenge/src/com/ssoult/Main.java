package com.ssoult;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;

//        boolean first = true;
        while (true){
            System.out.println("Enter a number");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();

//                if (first){
//                    first = false;
//                    max = number;
//                    min = number;
//                }
                if (number < min){
                    min = number;
                }
                if (number > max){
                    max = number;
                }
            }else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Max = "+ max +" Min = "+min);
    }
}
