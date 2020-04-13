package com.ssoult;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];
    private ArrayList<String> groceries = new ArrayList<String>();

    public ArrayList<String> getGroceyList(){
        return groceries;
    }
    public void addGroceryItem( String item){
        //adding grocery item
        groceries.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have "+groceries.size()+" items in your grocery list.");
        for (int i = 0 ; i < groceries.size(); i++){
            System.out.println((i+1)+", "+groceries.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem){

        int position = findItem( currentItem );
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem){
        groceries.set(position, newItem);
        System.out.println("Grocery item "+(position + 1)+" has been modified.");
    }
    public void removeGroceryItem(String newItem){

        int position = findItem( newItem );
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }
    private void removeGroceryItem( int position){
        groceries.remove(position);
        //Milk
        //Cheese
        //Bread
    }
    public int findItem( String searchItem ){

        return groceries.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }
        return false;
    }

}
