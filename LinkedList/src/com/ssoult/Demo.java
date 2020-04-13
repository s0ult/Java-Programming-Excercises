package com.ssoult;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Metamorphosis");
//        placesToVisit.add("Neo Iraklio");
//        placesToVisit.add("Nea Ionia");
//        placesToVisit.add("Psyxiko");
//        placesToVisit.add("Monasthraki");
//        placesToVisit.add("Monako");
//
//
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1,"Khfhsia");
//
//        printList(placesToVisit);
//
//         placesToVisit.remove(4);
//        printList(placesToVisit);

        addInOrder("Monako", placesToVisit);
        addInOrder("Monako", placesToVisit);
        addInOrder("Athens", placesToVisit);
        addInOrder("Colorado", placesToVisit);
        addInOrder("New York", placesToVisit);

        printList(placesToVisit);
        visit(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {

        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visited " + i.next());
    }

        System.out.println("=============");
}
    public static boolean addInOrder( String newCity,LinkedList < String > linkedList){

    ListIterator < String > stringListIterator = linkedList.listIterator();
    while (stringListIterator.hasNext()){

        int comparison = stringListIterator.next().compareTo( newCity );
        if ( comparison == 0){
            //equal do not add to ordered list
            System.out.println("New city "+newCity+" is already included as a destination.");

            return false;
        }else if (comparison > 0){
            //newCity should appear before this one
            //Brisbane -> Adelaide comparison > 0
            stringListIterator.previous();
            stringListIterator.add(newCity);
            return true;
        }else if (comparison < 0){
            //move on next city
        }
    }

    stringListIterator.add( newCity );
    return true;
}

    private static void visit( LinkedList cities){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator <String> listIterator = cities.listIterator();

        if (cities.isEmpty()){
            System.out.println("No cities in the itinerary.");
        }else{
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            switch (action) {
                case 0:
                    System.out.println("Holiday over.");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    }else{
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }else{
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
                default:
                    printMenu();
                    break;
            }

        }


    }

private static void printMenu(){
    System.out.println("Available actions: \n press ");
    System.out.println("0 - to quit\n"+
            "1 - go to next city\n"+
            "2 - go to previous city\n"+
            "3 - print menu options");
}
}
