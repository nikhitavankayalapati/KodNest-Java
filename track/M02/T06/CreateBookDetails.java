package track.M02.T06;

import java.util.Scanner;

class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class CreateBookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String title = sc.nextLine();
        String author = sc.nextLine();

        Book b = new Book(title, author);

        b.display();

        sc.close();
    }
}