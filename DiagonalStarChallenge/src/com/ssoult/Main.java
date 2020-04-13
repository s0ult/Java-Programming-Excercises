package com.ssoult;

public class Main {

    public static void main(String[] args) {



        printSquareStar(125);
    }

    public static void printSquareStar(int number){

        if ( number < 5 ){
            System.out.println("Invalid Value");
            return;
        }

        int i = 1;
        String star ="";
        while (i <= number){

                int j = 1;

                while ( j <= number) {
                if (i == 1 || i == number){
//                    System.out.printf("*");
                    star += "*";
                }else if (j == 1 || j == number ){
//                    System.out.printf("*");
                    star += "*";
                }else if (i == j){
//                    System.out.printf("*");
                    star += "*";
                }else if (j == (number - i +1)){
//                    System.out.printf("*");
                    star += "*";
                }else{
//                    System.out.printf(" ");
                    star += " ";
                }
                j++;
            }
//            System.out.println();
            star += "\n";
            i++;
        }
        System.out.println(star);
    }
}

/*
*  public static void printSquareStar(int number){

        if (number < 5){
            System.out.println("Invalid Value");
        }else{

            int tempNum = number;

            for (int i = 1; i <= number ; i++){


                for (int j = 1; j <=tempNum ; j++){

                    if (j==1 | j == number || j == i || i == 1 ||  i == number || j == (number - i +1)){

                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }


                }
                System.out.println();
            }
        }
    }
* */