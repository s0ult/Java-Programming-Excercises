package com.ssoult;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;


    public Printer(int cartridgeLevel, boolean isDuplex) {

        if (cartridgeLevel >= 0 && cartridgeLevel <= 100){
            tonerLevel = cartridgeLevel;
        }else {
            tonerLevel = -1;
        }
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int fillUpToner(int tonerAmount){
        if (tonerAmount >= 0 && tonerAmount <= 100){
            if (tonerLevel + tonerAmount > 100){
                return -1;
            }

            tonerLevel += tonerAmount;
            return tonerLevel;
        }else {
            return -1;
        }
    }

    public int printPages(int pagesToPrint){
        System.out.println("Printing "+pagesToPrint+" pages.");
        if (isDuplex){
            System.out.println("Printing in duplex mode.");
//            pagesToPrint = (int) Math.ceil( pagesToPrint /(double) 2 );
            pagesToPrint = ( pagesToPrint / 2 ) + (pagesToPrint % 2);
        }
        pagesPrinted += pagesToPrint;
        System.out.println("Pages printed was : " + pagesToPrint+". New total print count for printer = "+pagesPrinted);

        return pagesPrinted;
    }


    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }
}
