package com.ssoult;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static MobilePhone mobilePhone = new MobilePhone("694589567");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("Enter action: (6 to show available actions)");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Shutting down...");
                    quit = true;
                    break;
                case 1:
                    printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }

    private static void startPhone(){
        System.out.println("Starting phone... ");
    }
    public static void printActions() {
        System.out.println("\nAvailable actions:\nPress ");
        System.out.println("0 - to shutdown.\n"+
                "1 - to print contacts.\n"+
                "2 - to add a new contact.\n"+
                "3 - to update an existing contact.\n"+
                "4 - to remove an existing contact.\n"+
                "5 - query if an existing contact exists.\n"+
                "6 - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }
    public static void printContacts(){
        mobilePhone.printContacts();
    }
    public static void addContact(){
        System.out.println("Enter the contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number: ");
        String phoneNumber = scanner.nextLine();
        Contact contact = Contact.createContact(name, phoneNumber);
        if ( mobilePhone.addNewContact( contact ) ){
            System.out.println("New contact added: name: "+name+" phone: "+phoneNumber);
        }else{
            System.out.println("Cannot add "+name+" already on file.");
        }
    }
    public static void removeContact(){
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        if ( mobilePhone.removeContact(existingContactRecord) ) {
            System.out.println("Successfully deleted record.");
        }else{
            System.out.println("Error deleting record.");
        }
    }
    public static void updateContact(){
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter the new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter the new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhoneNumber);
        if ( mobilePhone.updateContact( existingContactRecord, newContact ) ){
            System.out.println("Successfully updated record.");
        }else {
            System.out.println("Error updating record.");
        }
    }

    public static void queryContact(){
        System.out.println("Enter the existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: "+existingContactRecord.getName()+
                " phone number: "+existingContactRecord.getPhoneNumber());
    }
}
