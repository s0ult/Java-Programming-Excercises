package com.ssoult;

import java.util.ArrayList;

public class Branch {

    private String branchName;
        private ArrayList< Customer > customerArrayList;

    public ArrayList<Customer> getCustomerArrayList() {
        return customerArrayList;
    }

    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerArrayList = new ArrayList< Customer >();
        System.out.println("New branch created.");
    }

    public String getBranchName() {
        return branchName;
    }

    public boolean addNewCustomer(String customerName, double initialAmount){

        if (findCustomer( customerName ) == null ) {
            this.customerArrayList.add( new Customer(customerName, initialAmount) );

            System.out.println("New customer added: " + customerName );
            return true;
        }
            System.out.println("Error adding customer "+customerName+" is already registered to this branch.");
            return false;
    }

    public boolean addCustomerTransaction( String customerName, double transaction ) {

        Customer existingCustomer = findCustomer( customerName );

        if ( existingCustomer != null ) {
            existingCustomer.addTransactions( transaction );
            System.out.println("Adding new transaction to " + existingCustomer.getName());
            return true;
        }
        System.out.println("Error adding transaction.");
        return false;
    }


    private Customer findCustomer( String customerName ) {

        for (int i = 0; i < this.customerArrayList.size(); i++){
            Customer testingCustomer = this.customerArrayList.get( i );
            if ( customerName.toLowerCase().equals( testingCustomer.getName().toLowerCase() ) ){
                return testingCustomer;
            }
        }
        return null;
    }
}
