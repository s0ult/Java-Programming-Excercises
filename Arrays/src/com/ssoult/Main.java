package com.ssoult;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int myVariable = 50;
//        int[] myIntArray = new int[10];
//        myIntArray[5] = 50;
//        System.out.println(myIntArray[0]);
//       int[] myIntArray2 = {1,2,3};
//       int[] myIntArray3 = new int[10];
//
//       for (int i = 0; i<myIntArray3.length;i++){
//           myIntArray3[i] = i;
//       }
//
//
        int[] myIntegers = getIntegers(5);
        for (int i = 0 ;i<myIntegers.length;i++){
            System.out.println("element : "+ i +" typed value was "+myIntegers[i]);
        }
        System.out.println(getAverage(myIntegers));

    }
    public static int[] getIntegers(int number){
        System.out.println("Enter "+number+" integer values.\r");
        int[] values = new int[number];
        for (int i = 0; i<values.length;i++){
            values[i] = scanner . nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum = 0;
        for (int i=0;i<array.length;i++){
            sum += array[i];
        }
        return (double)sum /(double) array.length ;
    }
}
