package com.kodilla.patterns2.adapter.company.bookclassifier.libraryA;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}