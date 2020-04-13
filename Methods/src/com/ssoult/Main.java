package com.ssoult;

public class Main {

    public static void main(String[] args) {


        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(score, levelCompleted, bonus, gameOver);

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(score, levelCompleted, bonus, gameOver);


        score = 1500;
        String playerName = "aaa";
        int scorePosition = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName,scorePosition);

        score = 900;
        playerName = "aab";
        scorePosition = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName,scorePosition);
        score = 400;
        playerName = "aac";
        scorePosition = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName,scorePosition);

        score = 50;
        playerName = "aad";
        scorePosition = calculatedHighScorePosition(score);
        displayHighScorePosition(playerName,scorePosition);



    }

    public static void calculateScore(int score,
                                      int levelCompleted, int bonus,
                                      boolean gameOver) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score is " + finalScore);
        }
    }

    public static void displayHighScorePosition(String playerName,
                                               int highScorePosition) {
        System.out.println(playerName+" managed to get to position "+
        +highScorePosition);
    }

    public static int calculatedHighScorePosition(int highScore){

        System.out.println("Player had score of : " + highScore);
//        if (highScore >= 1000){
//            return 1;
//        }else if (highScore >= 500 ){
//            return 2;
//        }else if (highScore >= 100 ){
//            return 3;
//        }else{
//            return 4;
//        }
        int position = 4; //assuming 4 will be returned
        if (highScore >= 1000){
            position = 1;
        }else if (highScore>=500){
            position = 2;
        }else if (highScore >= 100){
            position = 3;
        }

        return position;

    }
}

