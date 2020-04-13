package com.ssoult;

public class Main {

    public static void main(String[] args) {


        boolean gameOver = true;

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
//        if (score < 5000){
//            System.out.println("Your score is less than 5000!");
//        }else if (score == 5000){
//            System.out.println("You got the high score!!!");
//        }else{
//            System.out.println("Your got a new high score!!!" +
//                    " Well done!!");
//        }
        if (gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was "+ finalScore);
        }

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true){
            int secondScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was "+ secondScore);
        }




    }
}
