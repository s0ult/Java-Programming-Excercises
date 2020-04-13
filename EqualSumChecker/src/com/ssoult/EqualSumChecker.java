package com.ssoult;

public class EqualSumChecker {

    public static void main(String[] args) {

        System.out.println(hasEqualSum(1,1,2));
        System.out.println(hasEqualSum(1,1,1));
    }


    public static boolean hasEqualSum
            (int first, int second, int third){
        boolean equalSum = false;

        if ( ( first + second ) == third ){
            equalSum =true;
        }
        return equalSum;
    }
}
/*
* public static boolean hasEqualSum(int first, int second, int third){
     
     int sum = first + second;
     if(sum == third){
         return true;
     }
     return false;
 }*/