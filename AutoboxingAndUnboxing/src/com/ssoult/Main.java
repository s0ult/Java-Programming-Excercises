package com.ssoult;

import java.util.ArrayList;
class IntClass{
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}


public class Main {

    public static void main(String[] args) {

        String[] strArray = new String[10];
        int[] intArray = new int [10];

        ArrayList< String > stringArrayList = new ArrayList< String >();

        stringArrayList.add("Tim");
//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intArrayList = new ArrayList<IntClass>();
    }
}
