package week5.BookStore;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<Book>();
        books.add(new Book("Java", 100, "Ali", "2019"));
        books.add(new Book("C++", 200, "Veli", "2018"));
        books.add(new Book("Python", 300, "Ayşe", "2017"));
        books.add(new Book("C#", 400, "Fatma", "2016"));
        books.add(new Book("C", 500, "Hayriye", "2015"));
        books.add(new Book("Ruby", 600, "Mehmet", "2014"));
        books.add(new Book("Go", 700, "Ahmet", "2013"));
        books.add(new Book("Scala", 800, "Ayhan", "2012"));
        books.add(new Book("Perl", 900, "Mehmet", "2011"));
        books.add(new Book("Swift", 1000, "Ali", "2010"));

        for (Book book : books) {
        System.out.println(book.getBookName() + " " + book.getPages() + " " + book.getWriter() + " " + book.getReleaseDate());
    }
        System.out.println("**********************");

        TreeSet<Book> sortedSet = new TreeSet<Book>(new BookSorterApp());

        sortedSet.addAll(books);
        for (Book book : sortedSet) {
        System.out.println(book.getBookName() + " " + book.getPages() + " " + book.getWriter() + " " + book.getReleaseDate());
        }



}
}
