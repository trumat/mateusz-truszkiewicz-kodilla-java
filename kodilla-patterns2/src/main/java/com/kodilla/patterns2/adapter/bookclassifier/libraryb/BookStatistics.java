package com.kodilla.patterns2.adapter.bookclassifier.libraryb;

import java.util.Map;

public interface BookStatistics {
    int averagePublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books);
    int medianPublicationYear(Map<BookSignature, com.kodilla.patterns2.adapter.bookclassifier.libraryb.Book> books);
}
