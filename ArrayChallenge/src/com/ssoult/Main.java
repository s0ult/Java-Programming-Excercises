package com.ssoult;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


        int[] myIntegerArray = getIntegers(5);

        printArray(myIntegerArray);
        int[] sortedIntegersArray = sortIntegers(myIntegerArray);
        printArray(sortedIntegersArray);

    }

    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter "+number+" elements");
        for (int i = 0;i<number;i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i =0; i<array.length;i++){
            System.out.printf(array[i]+", ");
        }
        System.out.println();
    }
    public static int[] sortIntegers(int[] array){
        int temp;
        int[] sortedArray = Arrays.copyOf(array,array.length);
        for (int i = 0;i < sortedArray.length;i++){
            for (int j = i; j < sortedArray.length;j++ ){
                if (sortedArray[i] < sortedArray[j]){
                 temp = sortedArray[i];
                 sortedArray[i] = sortedArray[j];
                 sortedArray[j] = temp;
                }
            }
        }
        return sortedArray;
    }
}
