package com.ssoult;

public class Main {

    public static void main(String[] args) {


        Printer e360 = new Printer(100,true);
        System.out.println("Initial page count = "+ e360.getPagesPrinted());

        e360.fillUpToner(56);
        e360.getTonerLevel();
        int pagesPrinted = e360.printPages(3);
        pagesPrinted = e360.printPages(5);




    }
}
