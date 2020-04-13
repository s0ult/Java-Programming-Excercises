package com.ssoult;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//
//        System.out.println("Enter the desired amount of integers to be greated in an array!");
//        int count = scanner.nextInt();
//        scanner.nextLine();
//        int[] intArray = readIntegers(count);
//        System.out.println("Minimum element in the array is : "+findMin(intArray));
//
//

        int [] myIntegers = {1,2,3,4,5,6};
        printArray(myIntegers);
        reverse(myIntegers);
        printArray(myIntegers);
    }

    public static int[] readIntegers(int count){
        int [] array = new int[count];
        for (int i=0;i<count;i++){
            System.out.println( "Enter the "+(i + 1)+" element : ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static int findMin(int[] array){

        int min = array [0];

        for (int i = 0; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    public static void printArray(int [] array){

        for (int i = 0; i < array.length; i++){
            System.out.printf(String.valueOf(array[i]));
            if (i < array.length-1){
                System.out.printf(" , ");
            }
        }
        System.out.println();
    }
    public static void reverse(int [] array){

        int temp;
        for (int i = 0; i < array.length / 2; i++){
//            System.out.printf(array[i]+ " , ");

            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
            System.out.println("array ["+i+"] "+array[i]+" array ["+(array.length - i - 1)+"] "+array[array.length - i - 1]);
        }
        System.out.println();
    }
}
