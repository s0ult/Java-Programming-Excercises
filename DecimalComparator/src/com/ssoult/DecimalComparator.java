package com.ssoult;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces( 3.176,3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces( double num1,
                                                        double num2){
       boolean equalByThreePlaces = false;


       int intNum1 = (int) (num1 * 1000);
       int intNum2 = (int) (num2 * 1000);
        //System.out.println(intNum1 +"  "+intNum2);
       if (intNum1 == intNum2){
           equalByThreePlaces = true;
       }
        return equalByThreePlaces;
    }
}
/*
*
 public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){

     int a = (int) (num1 *1000);
     int b = (int) (num2 *1000);
     if (a==b){
         return true;
     }
     return false;
 }*/