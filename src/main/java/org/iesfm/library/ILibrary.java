package org.iesfm.library;

import java.util.LinkedList;

public interface ILibrary {

    LinkedList<Book> findBooks(String genre);
}
