package com.ssoult;

import java.security.PublicKey;
import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList< Contact > myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }
    public ArrayList< Contact > getMyContacts(){
        return this.myContacts;
    }

    public  void printContacts(){
        System.out.println("Contacts List");
        for (int i = 0 ; i < myContacts.size(); i++ ){
            System.out.println(( i+1 )+ ". "+
                    "Name: "+myContacts.get( i ).getName()+
                    " Phone number: "+myContacts.get( i ).getPhoneNumber() );
        }
    }

    public boolean addNewContact( Contact contact ){
        if (findContact( contact.getName() ) >= 0 ){
//            System.out.println("Contact is already on file.");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact( Contact oldContact, Contact newContact){

        int position = findContact(oldContact);
            if (position < 0){
                System.out.println(oldContact.getName()+" was not found.");
                return false;
            }else{
                if (findContact(newContact.getName()) != -1){
                    System.out.println("Contact with name "+ newContact.getName()+
                            " already exists. Update was not successful.");
                    return false;
                }
            }
            this.myContacts.set(position,newContact);
            System.out.println(oldContact.getName()+" was replaced with "+newContact.getName());
            return true;
    }

    public boolean removeContact( Contact contact ){
        int position = findContact(contact);
        if (position >= 0){
            this.myContacts.remove(position);
            System.out.println(contact.getName()+" was deleted.");
            return true;
        }else{
            System.out.println(contact.getName()+" was not found.");
            return false;
        }
    }

    private int findContact( Contact contact ){
        return  this.myContacts.indexOf( contact );
    }
    private int findContact( String contactName ){

        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if ( contact.getName().equals(contactName) ){
                return i;
            }

        }
        return -1;
    }
    public String queryContact( Contact contact ){
        if (findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }
    public Contact queryContact(String name){

        int position = findContact(name);
        if (position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }
}
