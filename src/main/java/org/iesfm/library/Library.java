package org.iesfm.library;

import java.util.LinkedList;
import java.util.Objects;

public class Library implements ILibrary {
    private String name;
    private LinkedList<Book> books;
    private LinkedList<Member> members;
    private LinkedList<BookLend> bookLends;

    public Library(String name, LinkedList<Book> books, LinkedList<Member> members, LinkedList<BookLend> bookLends) {
        this.name = name;
        this.books = books;
        this.members = members;
        this.bookLends = bookLends;
    }

    @Override
    public LinkedList<Book> findBooks(String genre) {
        LinkedList<Book> genreBooks = new LinkedList<>();
        for(Book book: books) {
            if(book.hasGenre(genre)) {
                genreBooks.add(book);
            }
        }
        return genreBooks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Book> getBooks() {
        return books;
    }

    public void setBooks(LinkedList<Book> books) {
        this.books = books;
    }

    public LinkedList<Member> getMembers() {
        return members;
    }

    public void setMembers(LinkedList<Member> members) {
        this.members = members;
    }

    public LinkedList<BookLend> getBookLends() {
        return bookLends;
    }

    public void setBookLends(LinkedList<BookLend> bookLends) {
        this.bookLends = bookLends;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) && Objects.equals(books, library.books) && Objects.equals(members, library.members) && Objects.equals(bookLends, library.bookLends);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books, members, bookLends);
    }
}
