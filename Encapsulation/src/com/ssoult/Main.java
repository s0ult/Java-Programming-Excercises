package com.ssoult;

public class Main {

    public static void main(String[] args) {

//    Player MVP_S0UL_T = new Player();
//
//        MVP_S0UL_T.name = "MVP SOUL T";
//        MVP_S0UL_T.health = 20;
//        MVP_S0UL_T.weapon = "R-99";
//
//        int damage = 15;
//        MVP_S0UL_T.loseHealth(damage);
//        System.out.println("Remaining health =  "+MVP_S0UL_T.health);
//        damage = 11;
//        MVP_S0UL_T.loseHealth(damage);
//        System.out.println("Remaining health =  "+MVP_S0UL_T.health);
//        MVP_S0UL_T.health = 1_000;
//
//        MVP_S0UL_T.loseHealth(damage);
//        System.out.println("Remaining health =  "+MVP_S0UL_T.health);


        EnhancedPlayer player = new EnhancedPlayer("MVP S0UL T",100,"R-99");
        System.out.println("Initial health is = "+player.getHealth());
        int damage = 88;
        player.loseHealth(damage);
        System.out.println("Remaining health =  "+player.getHealth());

    }
}
