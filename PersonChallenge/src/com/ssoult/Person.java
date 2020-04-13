package com.ssoult;


public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public int getAge(){
        return this.age;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String surname){
        this.lastName = surname;
    }
    public void setAge(int age){
        if (age < 0 || age > 100){
            this.age = 0;
        }else {
            this.age = age;
        }
    }

    public boolean isTeen(){

        if (this.age > 12 && this.age <20){
            return true;
        }
        return false;
    }
    public String getFullName(){

        if (this.firstName.equals("") && this.lastName.equals("")) {
            return "";
        }else if (this.firstName.equals("")){
            return this.lastName;
        }else if (this.lastName.equals("")){
            return this.firstName;
        }

        return this.firstName + " " + this.lastName;
        }
    }

