package com.ssoult;

public class Main {

    public static void main(String[] args) {


        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= "+calculator.getAdditionResult());
        System.out.println("substract= "+calculator.getSubstractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setFirstNumber(0);

        System.out.println("mumtiply= "+calculator.getMultiplicationResult());
        System.out.println("division= "+calculator.getDivisionResult());

    }
}
