package com.ssoult;

public class BarkingDog {

    public static boolean shouldWakeUp( boolean barking, int hourOfDay){

        boolean wakeup = false;
        if (barking){
            if (hourOfDay < 8 && hourOfDay >= 0|| hourOfDay > 22 && hourOfDay <= 24){
                wakeup = true;
            }
        }
        return wakeup;
    }




    /*public class BarkingDog {
    public static boolean bark(boolean barking,int hourOfDay){
        if(barking){
            if (hourOfDay > 23){
                return false;
            }else if(hourOfDay >22){
                return true;
            }else if(hourOfDay >=8){
                return false;
            }else if(hourOfDay>=0){
                return true;
            }else{
                return false;
            }

        }
        return false;
    }

}*/
}
