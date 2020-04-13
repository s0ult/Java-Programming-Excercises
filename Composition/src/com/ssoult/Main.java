package com.ssoult;

public class Main {

    public static void main(String[] args) {

        Case theCase = new Case("MasterBox 521","CoolerMaster","evga gold 700w",new Dimensions(20,50,   40));

        Monitor theMonitor = new Monitor("Asus rog xl2911","Asus",27,new Resolution(2540,1400));

        Motherboard theMotherboard = new Motherboard("Asus gaming plus max","asus",4,4,"7.4.11");

        PC thePC = new PC(theCase,theMonitor,theMotherboard);
//        thePC.getMonitor().drawPixelAt(155,1200,"blue");
//        thePC.getMotherboard().loadProgram("Windows 10");

        thePC.powerUp();

        Sofa mySofa = new Sofa("sofa bed",3,"blue");
        Table myTable = new Table("coffe table",0,"brown");
        Tv myTv = new Tv("Samsung","uxre60",80,new Resolution(3840,2160));
        Chair myChair = new Chair("armchair","green");
        Light myLight = new Light("spotlight","warm",4);
        LivingRoom livingRoom = new LivingRoom(mySofa, myTable, myChair, myLight, myTv);


        livingRoom.getTheLight().turnOnLight();
        livingRoom.cleanRoom();
        livingRoom.getTheSofa().tidyUpSofa();


    }
}

