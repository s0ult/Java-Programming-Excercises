public class Main {

    public static void main(String[] args) {



        boolean isAlien = true;

        if (isAlien == false);
            System.out.println("It is an alien !!!");
        if (isAlien == true)
        System.out.println("It is an alien !!!");
        if (isAlien == true) {
            System.out.println("It is an alien !!!");
            System.out.println("And I am scared of aliens!!!!!");
        }

        int topScore = 80;

        if ( topScore < 100){
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if(topScore > secondTopScore && topScore < 100){
            System.out.println("Greater than second top score and" +
                    " less than 100");
        }

        if (topScore > 90 || secondTopScore <= 90){

            System.out.println("Either or both of the conditions are true");

        }
        int newValue = 50;
        if (newValue == 50){
            System.out.println( "newValue is equal to 50");
        }

        boolean isCar = true;

        if (isCar){
            System.out.println("This is not supposed to happen!");
            System.out.println(isCar);
        }

        isCar = true;
        //ternary operator
        boolean wasCar = isCar ? true : false;


        if (wasCar){
            System.out.println("wasCar was true!!");
        }


        int number =20;

        int number2 = (number == 20) ? 20 : 30;
        System.out.println( number+" "+number2);
    }
}
