package com.kodilla.patterns2.adapter.company.bookclassifier;


import com.kodilla.patterns2.adapter.company.bookclassifier.libraryB.Book;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryB.BookSignature;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryB.BookStatistics;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryB.Statistics;

import java.util.Map;

public class MedianAdaptee extends Statistics implements BookStatistics {

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics bookStatistics = new Statistics();
        return bookStatistics.medianPublicationYear(books);
    }
}
