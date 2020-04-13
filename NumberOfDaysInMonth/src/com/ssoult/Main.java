package com.ssoult;

public class Main {

    public static void main(String[] args) {

        System.out.println(isLeapYear(2000));
        System.out.println(getDaysInMonth(-2,2018));
    }


    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        if ( ( year % 4 == 0 ) && ( year % 100 != 0 ) || ( year % 400 == 0 ) ){

            return true;
        }
        return false;
    }

    public static int getDaysInMonth( int month, int year){

        if ( ( month < 1 || month > 12 ) ||
                ( year < 1 || year > 9999 )){
            return -1;
        }

        switch (month){
            case 1: //January 31 days
                return 31;
            case 2: //February 28 days but 29 in leap years
                if (isLeapYear(year)){
                    return 29;
                }
                    return 28;
            case 3: //March 31 days
                return 31;
            case 4: //April 30 days
                return 30;
            case 5: //May 31 days
                return 31;
            case 6: //June 30 days
                return 30;
            case 7: //July 31 days
                return 31;
            case 8: //August 31 days
                return 31;
            case 9: //September 30 days
                return 30;
            case 10: //October 31 days
                return 31;
            case 11: //November 30 days
                return 30;
            case 12: //December 31 days
                return 31;
                default: //Error
                    return -1;
        }


    }
}
/*
* public static boolean isLeapYear ( int year){

            if (year >= 1 && year <= 9999) {

                if ((year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
                    return true;
                }
            }
            return false;
        }
        public static int getDaysInMonth(int month, int year){

            if ((month<1 || month >12) || (year < 1 || year > 9999)){
                return -1;
            }

            int result;

            switch (month){
                case 1:
                    result = 31;
                    break;
                case 2:
                    if (isLeapYear(year)) {
                        result = 29;
                        break;
                    }
                    result = 28;
                    break;
                case 3:
                    result = 31;
                    break;
                case 4:
                    result = 30;
                    break;
                case 5:
                    result = 31;
                    break;
                case 6:
                    result = 30;
                    break;
                case 7:
                    result = 31;
                    break;
                case 8:
                    result = 31;
                    break;
                case 9:
                    result = 30;
                    break;
                case 10:
                    result = 31;
                    break;
                case 11:
                    result = 30;
                    break;
                case 12:
                    result = 31;
                    break;
                    default:
                        result = -1;
                        break;
                }
                return result;

        }
* */
