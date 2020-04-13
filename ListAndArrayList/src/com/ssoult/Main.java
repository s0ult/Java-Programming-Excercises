package com.ssoult;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] baseData = new int[3];
        System.out.println("Enter 3 integers: ");
        getInput(baseData);
        printArray(baseData);
        System.out.println("Pointer of baseData"+baseData+" length of baseData "+baseData.length);
        baseData = resizeArray(baseData , 5);
        System.out.println("Pointer of baseData"+baseData+" length of baseData "+baseData.length);
        System.out.println("Enter 5 integers: ");
//        getInput(baseData);
        printArray(baseData);

    }

    private static void getInput(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
    }

    private static void printArray(int [] array){

        for (int i = 0 ; i < array.length ; i++){
            System.out.printf(Integer.toString(array[i])+" ");
        }
        System.out.println();
    }
    private static int [] resizeArray(int [] array, int number){

        System.out.println(array);
        int [] original = array;
        array = new int[number];
        System.out.println("Pointer of array"+array+" length of array "+array.length);
        System.out.println(array);
        for (int i = 0; i < original.length; i++){
            array[i] = original[i];
        }
        return array;
    }
}
