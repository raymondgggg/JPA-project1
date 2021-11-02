package com.example.jpaproject1;

import java.util.Scanner;


public class Main {

    public static void displayMainMenu(){
        System.out.println( "\n-----Main Menu-----\nPlease select an option.\n" );
        System.out.println( "1. Books" );
        System.out.println( "2. Publishers" );
        System.out.println( "3. Authoring Entity" );
        System.out.println( "4. List all of the Primary Keys" );
        System.out.println( "5. Quit\n" );

        // scanner to take user input for main menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Option: ");

        int userChoice = scanner.nextInt();
        boolean choice;

        //TODO: add a loop?

        if (userChoice == 1){
            // TODO: booksMenu()
        }
        if (userChoice == 2){
            // TODO: PublishersMenu()
        }
        if (userChoice == 3){
            // TODO: authoringEntityMenu()
        }
        if (userChoice == 4){
            // TODO
        }
        if (userChoice == 5){

        }
    }

    public static void booksMenu(){
        System.out.println( "\n-----Books Menu-----\nPlease select an option.\n" );
        System.out.println( "1. Display all Books" );
        System.out.println( "2. Add a Book" );
        System.out.println( "3. List information about a Book" );
        System.out.println( "4. Delete a Book" );
        System.out.println( "5. Update a Book" );
        System.out.println( "6. Return to Main Menu\n" );
        System.out.println( "7. Exit\n" );

        // scanner to take user input for main menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Option: ");
        int userChoice = scanner.nextInt();

        if (userChoice == 1){
            //TODO: displayBooks()
            booksMenu();
        }
        if (userChoice == 2){
            //TODO: addBook()
            booksMenu();
        }
        if (userChoice == 3){
            //TODO: listInfoBooks()
            booksMenu();
        }
        if (userChoice == 4){
            //TODO: deleteBook()
            booksMenu();
        }
        if (userChoice == 5){
            //TODO: updateBook()
            booksMenu();
        }
        if (userChoice == 6){
            displayMainMenu();
        }
        if (userChoice == 7){
        }
    }


    public static void publishersMenu(){
        System.out.println( "\n-----Publishers Menu-----\nPlease select an option.\n" );
        System.out.println( "1. Display all Publishers" );
        System.out.println( "2. Add a Publisher" );
        System.out.println( "3. List information about a Publisher" );
        System.out.println( "4. Return to Main Menu\n" );
        System.out.println( "5. Exit\n" );

        // scanner to take user input for main menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Option: ");
        int userChoice = scanner.nextInt();

        if (userChoice == 1){
            //TODO: displayPublishers()
        }
        if (userChoice == 2){
            //TODO: addPublisher()
        }
        if (userChoice == 3){
            //TODO: listInfoPublishers()
        }
        if (userChoice == 4){
            displayMainMenu();
        }
        if (userChoice == 5){
        }
    }

    public static void authoringEntitiesMenu(){
        System.out.println( "\n-----Authoring Entities Menu-----\nPlease select an option.\n" );
        System.out.println( "1. Display all Authoring Entities" );
        System.out.println( "2. Add an Authoring Entities" );
        System.out.println( "3. List information about Writing Groups" );
        System.out.println( "4. Return to Main Menu\n" );
        System.out.println( "5. Exit\n" );

        // scanner to take user input for main menu
        Scanner scanner = new Scanner(System.in);
        System.out.println("Option: ");
        int userChoice = scanner.nextInt();

        if (userChoice == 1){
            //TODO: displayAuthoringEntities()
        }
        if (userChoice == 2){
            //TODO: addAuthoringEntities()
        }
        if (userChoice == 3){
            //TODO: listInfoWritingGroups()
        }
        if (userChoice == 4){
            displayMainMenu();
        }
        if (userChoice == 5){
        }
    }


    /**
     * A method which takes the User's input that is in a given integer range only.
     * @param low the minimum integer value the input can be
     * @param high the maximum integer value the input can be
     * @return the user's integer input in the desired range
     */
    public static int getIntRange( int low, int high ) {
        Scanner in = new Scanner( System.in );
        int input = 0;
        boolean valid = false;
        while( !valid ) {
            if( in.hasNextInt() ) {
                input = in.nextInt();
                if( input <= high && input >= low ) {
                    valid = true;
                } else {
                    System.out.println( "Invalid range" );
                }
            } else {
                in.next(); //clear invalid string
                System.out.println( "Invalid Input." );
            }
        }
        return input;
    } //End of the getIntRange method

    public static void main(String[] args) {
        System.out.println("Hello world");
        displayMainMenu();
    }





}