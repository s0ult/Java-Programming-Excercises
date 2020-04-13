package com.ssoult;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <=10; i++){

            System.out.println("Enter the "+i+" number");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
            }else {
                System.out.println("Enter a valid integer number");
                i--;
            }
            scanner.nextLine();
        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }
}
