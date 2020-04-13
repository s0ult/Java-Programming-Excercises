package com.ssoult;

public class Main {

    public static void main(String[] args) {


        int result = 1+2; //1 + 2 = 3

        System.out.println("Result 1 + 2 = " + result);

        /*  */

        int previousResult = result;

        System.out.println("Previous result = " + previousResult);

        result = result - 1;

        System.out.println("Result of 3 - 1 = " + result);

        System.out.println("Previous result = " + previousResult);

        result = result * 10; // 2 * 10 = 20

        System.out.println("2 * 10 = " + result);

        result = result / 5;

        System.out.println(" 20 / 5 = "+ result);

        result = result % 3; // το υπολοιπο της ακαίρεας διαίρεσης του 4 με το 3
        System.out.println("4 % 3 = "+ result);

        //abbreviating operators

        result++;
        System.out.println("1 + 1 = "+result);
        result--;
        System.out.println("2 - 1 = "+result);

        //result = result + 2;
        result += 2;
        System.out.println("1 + 2 = "+result);

        //result = result * 10
        result *= 10; //3 * 10 = 30

        System.out.println("3 * 10 = 30");

        //result = result / 3;

        result /= 3;
        System.out.println("30 / 3 = "+result);
        result -= 2;
        System.out.println("10 - 2 = "+ result);







    }
}
