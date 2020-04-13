package com.ssoult;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Player stavros = new Player("Stavros",200,99);
        System.out.println(stavros.toString());
        saveObject(stavros);

        stavros.setHitPoints(55);
        System.out.println(stavros);
        stavros.setWeapon("Sword of a Thousand Truths");
        saveObject(stavros);
        System.out.println(stavros.toString());
//
//        loadObject(stavros);
//        System.out.println(stavros.toString());



        ISaveable goblin = new Monster("Goblin",80,31);
        System.out.println(goblin.toString());
        System.out.println("Goblin's Strength = "+((Monster)goblin).getStrength());
        saveObject(goblin);



    }
    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable saveableObject){
        //writing to a hypothetical storage device
        for (int i = 0 ; i <saveableObject.write().size();i++){
            System.out.println("Saving "+saveableObject.write().get(i)+" to storage device.");
        }

    }
    public static void loadObject(ISaveable objectToLoad){
        //reading values from the saveable object
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
