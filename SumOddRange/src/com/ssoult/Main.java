package com.ssoult;

public class Main {

    public static void main(String[] args) {




    }
    public static boolean isOdd(int number){

        if (number <=0 ){
            return false;
        }
        if (number % 2 != 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){

        if (end < start || start <= 0 || end <= 0){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end;i++){
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}



/*
* public static boolean isOdd(int number){
        if (number <= 0){

            return false;
        }
        if (number % 2 !=0){
            return true;
        }

        return false;
    }
    public static int sumOdd(int start, int end){
        if ((start > 0) && (end > 0) && (end >= start) ) {
            int sum = 0;
            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {
                    sum += i;
                }

            }
            return sum;
        }else{
            return -1;
        }

    }
* */