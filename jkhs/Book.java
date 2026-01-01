import java.util.Scanner;

public class Book {
    String title;
    int price;


    public Book(String title, int price) {
        this.title = title; //b1
        this.price = price;
    }

    public void comparePrice(Book b) {  // b2
        if(this.price > b.price){
            System.out.println(this.title + " is costlier than " + b.title);
        }else if(this.price < b.price){
            System.out.println(b.title + " is costlier than " + this.title);
        } else {
            System.out.println("Both books have the same price");
        }

    }
    public static void main(String[] args) {
        Book b1 = new Book("Java", 444);
        Book b2 = new Book("DataBase", 333);

        b1.comparePrice(b2);

//        System.out.println(" count: " + Car.count);

    }
}