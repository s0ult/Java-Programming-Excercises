package com.ssoult;

public class Hamburger {

     private String burgerName;
     private String breadRollType;
     private String meatType;
     private int tomatoes;
     private int onions;
     private int pickles;
     private int lettuce;
     private double price;

    public Hamburger(String burgerName, String breadRollType, String meatType, double price) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = price;
    }

    public double calculateTotalPrice(){
        double totalCost = price + calculateAdditionalItemsPrice();
        return totalCost;
    }

    public void showPrice(){
        System.out.println(this.burgerName+
                " price      : "+this.price+" \n"+
                " bread type : "+this.breadRollType+" \n"+
                " meat       : "+this.meatType+" \n"+
                " lettuce    : "+this.lettuce +" * 0.8 \n"+
                " tomatoes   : "+this.tomatoes+" * 0.8 \n"+
                " onions     : "+this.onions  +" * 0.6 \n"+
                " pickles    : "+this.pickles +" * 0.5");
    }

    public double calculateAdditionalItemsPrice(){
        return (tomatoes * 0.8 + onions * 0.6 + pickles * 0.5 + lettuce * 0.8);
    }

    public double showBasePrice() {
        return price;
    }

    public void setTomatoes(int tomatoes) {
        this.tomatoes = tomatoes;
    }

    public void setOnions(int onions) {
        this.onions = onions;
    }

    public void setPickles(int pickles) {
        this.pickles = pickles;
    }

    public void setLettuce(int lettuce) {
        this.lettuce = lettuce;
    }

    public void setBurgerName(String burgerName) {
        this.burgerName = burgerName;
    }
}
