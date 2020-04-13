package com.ssoult;

public class Main {

    public static void main(String[] args) {


        //primitive types
        //pimitive type int
        int myValue = 10_000;
        System.out.println(myValue);
        //Integer. ... = Wrapper class
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("BUSTED MAX VALUE = " + (Integer.MAX_VALUE + 1));
        System.out.println("Overflow !!! ");

        System.out.println("BUSTED MIN VALUE = "+ (Integer.MIN_VALUE - 1));
        System.out.println("Underflow !!! ");

        int myMaxIntTest =  2_147_483_647;
        int myMinIntTest = -2_147_483_648;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);

        int myMinByteTest =  127;
        int myMaxByteTest = -128;

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        //byte 8 bits width of 8 2^7
        //short 16 bits width of 16 2^5
        //integer 32 bits width of 32 2^31
        //long 64 bits width of 64 2^63


        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);

        long bigLongLiteralValue = 2147483647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;

        int myTotal = ( myMaxIntValue / 2 );
        byte myNewByteValue = (byte) (myMinByteValue /2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);

    }
}
