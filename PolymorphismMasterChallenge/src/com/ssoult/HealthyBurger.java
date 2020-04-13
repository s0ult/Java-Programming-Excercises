package com.ssoult;

public class HealthyBurger extends Hamburger {

    private int avocado;
    private int prawns;

    public HealthyBurger( String meatType) {
        super("Healthy Hamburger","brown rye bread roll", meatType, 8.9);
    }


    @Override
    public double calculateAdditionalItemsPrice() {
        double additionsPrice =  super.calculateAdditionalItemsPrice() + (avocado * 1.6) + (prawns * 2.7);
        return additionsPrice;
    }

    @Override
    public void showPrice() {
        super.showPrice();
            System.out.println(" avocado    : "+this.avocado+" * 1.6 \n"+
                               " prawns     : "+this.prawns +" * 2.7");
        System.out.println("  Total price : "+calculateTotalPrice());

    }

    public void setAvocado(int avocado) {
        this.avocado = avocado;
    }

    public void setPrawn(int prawn) {
        this.prawns = prawns;
    }
}
