package com.ssoult;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList< Double > transactions = new ArrayList< Double >();
        transactions.add((double) 12);
        transactions.add((double) 16);
        transactions.add((double) 17);
        System.out.println(transactions.get(0).doubleValue());

//
        Bank bank = new Bank("Pireaus");

        //creating and adding new branch
        bank.addNewBranch("Neo Iraklio");



//        Branch branch = new Branch("Neo Iraklio");
//creating customers
        bank.addCustomer("Neo Iraklio","Stavros", 12.555);

        bank.addCustomer("Neo Iraklio","Aris", 10.001 );

        bank.addCustomer("Neo Iraklio","Xristos", 150.6*4*2 );

        bank.addCustomer("Neo Iraklio","Mixalhs", 930.15 );

        bank.addCustomer("Neo Iraklio","Mixalhs", 930.15 );



        bank.addNewBranch("Neo Iraklio");

        bank.showListOfCustomers("Neo Iraklio",true);

    }
}
