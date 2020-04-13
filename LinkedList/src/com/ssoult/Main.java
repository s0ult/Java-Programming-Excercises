package com.ssoult;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Customer customer = new Customer( "Stavros", 1_099_999.99);

        Customer anotherCustomer;
         anotherCustomer = customer;
         anotherCustomer.setBalance( 111_111);
        System.out.println( "Balance for customer "+customer.getName()+" is "+customer.getBalance() );

        ArrayList < Integer > intArrayList = new ArrayList<>();
        intArrayList.add(1);
        intArrayList.add(3);
        intArrayList.add(4);

        for (int i = 0 ; i < intArrayList.size();i++){
            System.out.println("Integer array list value : "+i+" = "+intArrayList.get( i ) );
        }
        intArrayList.add(1,2);

        for (int i = 0 ; i < intArrayList.size();i++){
            System.out.println("Integer array list value : "+i+" = "+intArrayList.get( i ) );
        }
    }
}
