package com.ssoult;

public class Main {

    public static void main(String[] args) {


        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);

    }
    public static  void printEqual(int first, int second, int third){

        if (first < 0 || second < 0 || third < 0){

            System.out.println("Invalid Value");
            return;
        }
        if (first == second && first == third){

            System.out.println("All numbers are equal");
            return;
        }
        if (first != second && first != third && second != third){

            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");

    }
    /*
    *     public static void printEqual(int a ,int b ,int c){

        if (a < 0 || b < 0 || c < 0){
            System.out.println("Invalid Value");
        }else if(a == b && b == c){
            System.out.println("All numbers are equal");
        }else if(a != b && b != c && c != a){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
    */
}
