package com.kodilla.patterns2.adapter.bookclassifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclassifier.librarya.Book> bookSet);
}
