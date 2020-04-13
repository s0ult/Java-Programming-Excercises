package com.ssoult;

public class DeluxeHamburger extends Hamburger {

    private int chips;
    private int drinks;

    public DeluxeHamburger(String breadRollType, String meatType) {
        super("Deluxe Hamburger", breadRollType, meatType,12.2 );
        this.chips = 1;
        this.drinks = 1;
    }

    @Override
    public void showPrice() {
        super.showPrice();
        System.out.println(" chips      : "+this.chips +" * 1.6 \n"+
                           " drinks     : "+this.drinks+" * 2.2");
        System.out.println("  Total price : "+calculateTotalPrice());

    }

    @Override
    public double calculateAdditionalItemsPrice() {
        double additions = super.calculateAdditionalItemsPrice() + ( chips * 1.6 ) + ( drinks * 2.2 );
        return additions;
    }

    public void setChips(int chips) {
        this.chips = chips;
    }

    public void setDrinks(int drinks) {
        this.drinks = drinks;
    }
}
