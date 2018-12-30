package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        Book book1 = new Book("Author1", "Title1", 1997, "123abc");
        Book book2 = new Book("Author2", "Title2", 1960, "456abc");
        Book book3 = new Book("Author3", "Title3", 2003, "789abc");
        Book book4 = new Book("Author4", "Title4", 2001, "123def");
        Book book5 = new Book("Author5", "Title5", 2018, "123ghi");
        Book book6 = new Book("Author6", "Title6", 1930, "123jkl");
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        bookSet.add(book6);
        //When
        MedianAdapter medianAdapter = new MedianAdapter();
        int median = medianAdapter.publicationYearMedian(bookSet);
        //Then
        assertEquals(2001, median);
    }
}
