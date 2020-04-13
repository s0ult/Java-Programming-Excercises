package com.ssoult;

public class Main {

    public static void main(String[] args) {


        byte myByteValuue = 120;

        short myShortVaLUE = 16_000;

        int myIntValue = 2_000_000_000;

        long myLongValue = 50_000L + 10L * (myByteValuue + myShortVaLUE +
                + myIntValue);

        System.out.println(myLongValue);
    }
}
