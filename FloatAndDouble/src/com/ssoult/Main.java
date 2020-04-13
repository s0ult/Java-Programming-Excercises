package com.ssoult;

public class Main {

    public static void main(String[] args) {


        float myMinFloat = Float.MIN_VALUE;
        float myMaxFloat = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloat);
        System.out.println("Float maximum value = " + myMaxFloat);



        double myMinDouble = Double.MIN_VALUE;
        double myMaxDouble = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDouble);
        System.out.println("Double maximum value = " + myMaxDouble);

        int myIntValue = 5 / 2;
        float myFloatValue =   (float) 5 / 3;
        double myDoubleValue = (double)5 / 3;
        myDoubleValue = 5.0 / 3.00;

        System.out.println("myIntValue = "+myIntValue);
        System.out.println("myFloatValue = "+myFloatValue);
        System.out.println("myDoubleValue = "+myDoubleValue);





    }
}
