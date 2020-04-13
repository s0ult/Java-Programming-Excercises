package com.ssoult;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");
    public static void main(String[] args) {



        Gearbox mcLaren = new Gearbox(6,5.3);

        mcLaren.changeGear(2);

        System.out.println(mcLaren.speed(1000));
        mcLaren.setClutchIsIn(true);
        mcLaren.changeGear(2);
        System.out.println(mcLaren.speed(3000));

        System.out.println(mcLaren.getGearNumber());

        mcLaren.setClutchIsIn(false);
        mcLaren.changeGear(6);
        System.out.println(mcLaren.speed(4500));

        System.out.println(mcLaren.getGearNumber());


        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title+" was pressed");
            }
        });


        class Listener implements Button.OnClickListener {


            public Listener(){
                System.out.println("I've been attached.");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title+" was pressed");
            }
        }
        btnPrint.setOnClickListener(new Listener() );
//        btnPrint.onClick();
        listen();
    }

    private static void listen(){
        boolean quit = false;

        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    System.out.println("Stopping listener.");
                    quit = true;
                    break;
                case 1:
                    System.out.println("Listener was invoked");
                    btnPrint.onClick();
                    break;
                default:
                    break;
            }
        }
    }
}
