package com.ssoult;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {


//        Gearbox vw = new Gearbox(6);
//        //Gearbox.Gear <------ inner class declaration ---> instance.new Gear()
////        Gearbox.Gear first = vw.new Gear(1,12.3);
//        Gear first = vw.addGear(1,12.3);
//        System.out.println(first.driveSpeed(1000));
//
////        Gearbox.Gear second = new Gearbox.Gear(1,12.3);
////        Gearbox.Gear third  = new vw.Gear(1,12.3);
//----------------------------------------
//
//                Gearbox vw = new Gearbox(6);

//                vw.operateClutch(true);
//                vw.changeGear(1);
//                vw.operateClutch(false);
//                System.out.println(vw.wheelSpeed(1000));
//                vw.changeGear(2);
//                System.out.println(vw.wheelSpeed(3000));
//
//                vw.operateClutch(true);
//                vw.changeGear(3);
//                vw.operateClutch(false);
//                System.out.println(vw.wheelSpeed(6000));


//
//                class ClickListener implements Button.OnClickListener{
//                    public ClickListener(){
//                        System.out.println("I've been attached.");
//                    }
//
//                    @Override
//                    public void onClick(String title) {
//                        System.out.println(title+" was clicked.");
//                    }
//
//
//                }
                btnPrint.setOnClickListener(new Button.OnClickListener() {
                    @Override
                    public void onClick(String title) {
                        System.out.println(title+" Was clicked");
                    }
                });
                listen();


    }
    private static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
                    break;
            }
        }
    }
}
