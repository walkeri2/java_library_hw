import org.junit.Before;
import org.junit.Test;

import java.awt.print.Book;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book();
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(6, library.bookCount());
    }




}
