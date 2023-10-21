package week5.BookStore;

import java.util.Comparator;

public class BookSorterApp implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getBookName().compareTo(o1.getBookName());
    }
}
