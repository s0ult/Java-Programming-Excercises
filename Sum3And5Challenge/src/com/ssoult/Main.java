package com.ssoult;

public class Main {

    public static void main(String[] args) {

        int sum = 0;
        int counter = 0;
        for (int i = 1;i <= 1_000;i++) {


            if (i % 3 == 0 && i % 5 == 0) {

                    sum += i;
                    counter++;
                    System.out.println("Found number -> "+i+" sum = "+sum);
                }

            if (counter == 5) {
                break;
            }

        }

    }
}
