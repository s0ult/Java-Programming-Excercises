package com.ssoult;

public class Main {

    public static void main(String[] args) {

        System.out.println(can2Pack(1,0,4));
        System.out.println(can2Pack(1,0,5));
        System.out.println(can2Pack(0,5,4));
        System.out.println(can2Pack(2,2,11));
        System.out.println(can2Pack(-3,2,12));


    }

    public static boolean canPack(int bigCount, int smallCount, int goal){

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int sum = 5 * bigCount + smallCount;

//        System.out.println("sum = "+sum+" goal = "+goal);
        if (goal == sum){
            return true;
        }else if (goal > sum){
            return false;
        }

//        System.out.println("holla holla");

        int tempGoal = goal;
        for (int i = bigCount; i >= 0; i--){

//            System.out.println("********");
//            System.out.println("i = "+i+ " tempGoal = "+tempGoal);
            if (tempGoal - (5 * i) >= 0){
                tempGoal -= 5 * i;
            }

//            System.out.println("tempGoal = "+tempGoal);
            for (int j = smallCount; j >= 0; j--){

                if (tempGoal - j >= 0){
                    tempGoal -= j;
                }
            }
//            System.out.println("tempGoal = "+tempGoal);

            if (tempGoal == 0){
                return true;
            }
            tempGoal = goal;
        }
        return false;
    }

    public static boolean can2Pack(int bigCount, int smallCount, int goal){

        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }

        int sum = 5 * bigCount + smallCount;

//        System.out.println("sum = "+sum+" goal = "+goal);
        if (goal == sum){
            return true;
        }else if (goal > sum){
            return false;
        }

        int remainder = goal % 5;
        return smallCount >= remainder;
    }
}
