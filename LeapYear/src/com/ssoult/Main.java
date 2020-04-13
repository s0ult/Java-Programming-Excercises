package com.ssoult;

public class Main {

    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }
    public static boolean isLeapYear(int year){
        boolean isLeapYear = false;
        if (year>= 1 && year <= 9999){
            if (year % 4 == 0){
                 if(year % 100 == 0){
                        if(year % 400 == 0) {
                        isLeapYear = true;
                        }
                 }else {
                     isLeapYear = true;
                 }
            }
        }
        return isLeapYear;
    }

    /*
    * public class LeapYear {
    public static boolean isLeapYear(int year){

        if(year >= 1 && year<=9999){
            if(((year % 4 ) == 0) && (year % 100 != 0) || (year % 400 == 0 )){

                return true;
            }

        }
        return false;

    }

}*/
}
