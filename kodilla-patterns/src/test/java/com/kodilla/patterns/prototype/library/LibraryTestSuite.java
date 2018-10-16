package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {
    @Test
    public void testGetBooks () {
        //Given
        Library library = new Library("Library 1");

        Book book1 = new Book("Title 1", "Author 1", LocalDate.of(1991, 3, 2));
        Book book2 = new Book("Title 2", "Author 2", LocalDate.of(1930, 10, 2));
        Book book3 = new Book("Title 3", "Author 2", LocalDate.of(1890, 9, 5));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        Library libraryShallowCopy = null;
        try {
            libraryShallowCopy = library.shallowCopy();
            libraryShallowCopy.setName("Library 2");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library libraryDeepCopy = null;
        try {
            libraryDeepCopy = library.deepCopy();
            libraryDeepCopy.setName("Library 3");
        } catch(CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        libraryShallowCopy.getBooks().remove(book1);

        //Then
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, libraryShallowCopy.getBooks().size());
        Assert.assertEquals(3, libraryDeepCopy.getBooks().size());
        Assert.assertEquals(library.getBooks(), libraryShallowCopy.getBooks());
        Assert.assertNotEquals(library.getBooks(), libraryDeepCopy.getBooks());
    }
}
