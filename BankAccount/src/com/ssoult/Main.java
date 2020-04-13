package com.ssoult;

public class Main {

    public static void main(String[] args) {


        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1);
        bankAccount.setCustomerName("Stavros Soultanidis");
        bankAccount.setEmail("123steve");
        bankAccount.setPhoneNumber(12345);
        bankAccount.setBalance(12.70);
        bankAccount.depositFunds(1.70);
        bankAccount.withdrawFunds(1_000_000);
        bankAccount.withdrawFunds(1_0);
    }
}
