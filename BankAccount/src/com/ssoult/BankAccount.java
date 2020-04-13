package com.ssoult;

public class BankAccount {


        private int accountNumber;
        private double balance;
        private String customerName;
        private String email;
        private int phoneNumber;


        public BankAccount(){
            this(123,0,"Default name","Default email",0);
            System.out.println("Empty constructor called");
        }
        public BankAccount(int accountNumber, double balance, String customerName, String email,int phoneNumber){
            System.out.println("Constructor with parameters called");
            this.accountNumber = accountNumber;
            this.balance = balance;
            this.customerName = customerName;
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double funds){

        System.out.println("Depositing an amount of "+funds+" balance");
        this.balance += funds;
        System.out.println("New balance is "+this.balance);
    }

    public void withdrawFunds(double funds){
        if (funds > this.balance){
            System.out.println("The amount you are trying to withdraw is greater than your balance!");
        }else{
            System.out.println("Withdrawing an amount of "+funds+" balance.");
            this.balance -= funds;
            System.out.println("New balance is "+this.balance);
        }
    }
}
