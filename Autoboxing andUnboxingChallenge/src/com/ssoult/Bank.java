package com.ssoult;

import java.util.ArrayList;

public class Bank {

    private String bankName;
    private ArrayList< Branch > branchArrayList;

    public Bank( String bankName ) {
        this.bankName = bankName;
         this.branchArrayList = new ArrayList< Branch >();
        System.out.println(this.bankName+" created.");
    }

    public String getBankName() {
        return bankName;
    }

    public boolean addNewBranch( String branchName ) {
        if (findBranch( branchName ) == null) {
            branchArrayList.add(new Branch(branchName));
            System.out.println("New bank branch added.");
            return true;
        }
        System.out.println("Branch already exists.");
        return false;
    }
    public boolean addCustomer( String branchName, String customerName, double transaction ){
        Branch branch = findBranch( branchName );
        if ( branch != null ){
            System.out.println("Added new customer "+customerName+" to the branch.");
            return branch.addNewCustomer( customerName, transaction );
        }
        System.out.println("Error adding customer, branch "+branchName+" not found.");
        return false;
    }

    public boolean addCustomerTransaction(String branchName , String customerName, double transaction ) {

        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch .addCustomerTransaction( customerName, transaction);
        }
        return false;
    }
    public boolean showListOfCustomers( String branchName , boolean showTransactions){

        Branch branch = findBranch(branchName);
        if (branch != null) {
                System.out.println("Customers of branch "+branch.getBranchName() );
                ArrayList < Customer > branchCustomersArrayList = branch.getCustomerArrayList();
                for (int i = 0 ; i < branchCustomersArrayList.size(); i++){

                    Customer branchCustomer = branchCustomersArrayList.get(i);
                System.out.println("Customer: "+branchCustomer.getName()+"["+ (i+1) +"]");
                if (showTransactions){

                    ArrayList < Double> transactions = branchCustomer.getTransactions();
                    System.out.println("    Transactions : ");
                    for (int j = 0 ; j < transactions.size(); j ++ ){
                        System.out.println( "   ["+(j+1)+"] Amount "+transactions.get(j) );
                    }
                }
            }
            return true;
        }
        System.out.println("Error, branch "+branchName+" not found.");
        return false;
    }
//    public void showListOfCustomerTransactions(){
//
//        System.out.println("    Transactions : ");
//        for (int i = 0;i < branchArrayList.size(); i++ ) {
//            for (int j = 0; j < branchArrayList.get(i).getCustomerArrayList().size(); j++) {
//                System.out.println(branchArrayList.get(i).getCustomerArrayList().get(j).getName());
//                System.out.println(branchArrayList.get(i).getCustomerArrayList().get(j).getTransactions());
//            }
//        }
//    }

    private Branch findBranch( String branchName ) {

        for (int i = 0; i < this.branchArrayList.size(); i++) {
            Branch testingBranch = this.branchArrayList.get(i);
            if (branchName.toLowerCase().equals(testingBranch.getBranchName().toLowerCase())) {
                return testingBranch;
            }
        }
        return null;
    }

}
