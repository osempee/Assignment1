package Week3;

import java.util.Scanner;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean borrowed;

    public Book(String title, String author, int publicationYear, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.borrowed = false;

    }
    public int numberOfPages;

    public Book(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public Book(String title, String author, int publicationyear) {
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public String toString(){
     return title + " " + author + " " + publicationYear + " " + borrowed;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("title");
        String title = scanner.nextLine();
        System.out.println("author");
        String author = scanner.nextLine();
        System.out.println("publicationYear");
        int publicationyear = scanner.nextInt();
        Book book = new Book(title, author,publicationyear);
        System.out.println(book);
    }
}
