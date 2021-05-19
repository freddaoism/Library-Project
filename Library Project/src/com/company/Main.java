package com.company;



public class Main {

    public static void main(String[] args) {


        // Create two libraries
        Library firstLibrary = new Library("10 Main St.");
        Library secondLibrary = new Library("228 Liberty St.");

        //Adding books to first library and printing them at the same time
        System.out.println("Books available in the first library:");


        // Add four books to the first library
        firstLibrary.addBook("The Da Vinci Code");
        System.out.println(firstLibrary.availbook());
        firstLibrary.addBook("Le Petit Prince");
        System.out.println(firstLibrary.availbook());
        firstLibrary.addBook("A Tale of Two Cities");
        System.out.println(firstLibrary.availbook());
        firstLibrary.addBook("The Lord of the Rings");
        System.out.println(firstLibrary.availbook());

        System.out.println("Books available in the second library:");
        System.out.println("No books are in our catalogue at the moment");


        // Print opening hours and the addresses
        System.out.println("First Library");
        System.out.println(firstLibrary.openhours());
        System.out.println(firstLibrary.printAddr());

        // Print opening hours and the addresses
        System.out.println("Second Library");
        System.out.println(secondLibrary.printAddr());
        System.out.println(secondLibrary.openhours());

        // Print library addresses
        System.out.println("Library addresses:");
        System.out.println(firstLibrary.printAddr());
        System.out.println(secondLibrary.printAddr());

        // Small test of borrowing outcomes
        Book example = new Book("The Lord of the Rings");
        System.out.println("Borrowing: " + example.getTitle());
        System.out.println("Is it true that this book is borrowed? " + example.isBorrowed() + " Would you like to borrow it?");

        example.borrowed();
        System.out.println("Is it true that this book is borrowed? " + example.isBorrowed());

        example.returned();
        System.out.println("Is it true that this book is waiting to be returned? " + example.isBorrowed() + " It was just returned!");


        System.out.println("Do you have this book? "  + example.noStock());

        example.returned();
        System.out.println("I am here to return this book. " + example.returnedStatement());







    }

    public static class Book {

        String title;
        boolean borrowed;


        public Book(String bookTitle) {
            title=bookTitle;
        }

        // Marks the book as borrowed
        public void borrowed() {
            borrowed=true;
        }

        // Marks the book as not borrowed
        public void returned() {
            borrowed=false;
        }

        // Marks the book as not borrowed
        public String returnedStatement() {
            String str3 = "You have successfully returned " + title;

            return str3;
        }

        // Returns true if the book is borrowed, false otherwise
        public String isBorrowed() {
            String str;

            if(borrowed){
                str= "Sorry, we don't have " + title + " right now.";
            }else{
                str = "We do have " + title + " would you like to borrow it?";
            }
            return str;
        }

        // Returns false if book is not in stock
        public String noStock() {
            String str2 = "Sorry, " + title + " is not in our catalog.";

        return str2;
        }

        // Returns the title of the book
        public String getTitle() {
            return title;
        }


    }
    public static class Library {

        String addr;
        Book bk;
        int i=0;

        // Creates a new com.company.Main.Library
        public Library(String address) {
            addr=address;
        }

        // adds book
        public void addBook(String abook) {
            bk=new Book(abook);
        }

        // Announces library hours
        public String openhours(){
            String hours="Libraries are open daily from 9am to 5pm.";
            return hours;
        }

        // Returns address as a string
        public String printAddr(){
            return addr;
        }

        // Returns available books
        public String availbook(){
            return bk.getTitle();
        }
    }
}
