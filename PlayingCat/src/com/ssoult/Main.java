package com.ssoult;

public class Main {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true,10));
        System.out.println(isCatPlaying(false, 35));
        System.out.println(isCatPlaying(false, 36));
    }


    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer){

            if (temperature >= 25 && temperature <= 45){
                return true;
            }

        }else{
            if (temperature >= 25 && temperature <= 35){
                return true;
            }
        }

        return false;
    }


}
/*
*
*         public static boolean isCatPlaying(boolean summer,int temperature){

        if (summer  &&(temperature >= 25 && temperature <= 45)){
            return true;
        }
        if (!summer &&(temperature >= 25 && temperature <= 35)){
            return true;
        }
        return false;
    }
    */