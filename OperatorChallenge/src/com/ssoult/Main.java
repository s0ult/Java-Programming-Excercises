package com.ssoult;

public class Main {

    public static void main(String[] args) {



        double firstDoubleValue  = 20.00;
        double secondDoubleValue = 80.00;


        double sumOfDouble = firstDoubleValue + secondDoubleValue;
        double sumOfMultiplication = sumOfDouble* 100.00;

        double remainderOfSum = sumOfMultiplication % 40.00;

        System.out.println("20.00 + 80.00 = "+ sumOfDouble);
        System.out.println(sumOfDouble+" * 100.00 = "+ sumOfMultiplication);
        System.out.println(sumOfMultiplication + " % 40.00 = "+remainderOfSum);

        boolean isRemainderZero = (remainderOfSum == 0) ? true : false;
        System.out.println("Is the ramainder of "+sumOfMultiplication+" % 40.00 equal to 0 ? The answer" +
                " is "+isRemainderZero);
        if (remainderOfSum != 0){
            System.out.println("Got some remainder!");
        }else{
            System.out.println("No remainder !!");
        }


    }
}
