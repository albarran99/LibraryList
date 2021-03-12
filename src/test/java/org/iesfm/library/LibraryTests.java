package org.iesfm.library;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LibraryTests {
    @Test
    public void hasGenreTest() {
        LinkedList<Book> books = new LinkedList<>();
        LinkedList<String> genres = new LinkedList<>();
        genres.add("Terror");
        books.add(new Book(1, "titulo1", "autor", genres));
        books.add(new Book(2, "titulo2", "autor", genres));
        books.add(new Book(3, "titulo3", "autor", genres));
        books.add(new Book(4, "titulo4", "autor", new LinkedList<>()));
        Book b = new Book(4, "titulo4", "autor", new LinkedList<>());
        
        if(books.contains(b)) {
            System.out.println("existe");
        }
        Library library = new Library("Mi libre", books, new LinkedList<>(), new LinkedList<>());

        LinkedList<Book> terrorBooks = library.findBooks("Terror");

        Assert.assertEquals(books.subList(0, 3), terrorBooks);

    }
}
