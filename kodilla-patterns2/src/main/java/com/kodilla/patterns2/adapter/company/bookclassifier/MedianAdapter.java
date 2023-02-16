package com.kodilla.patterns2.adapter.company.bookclassifier;

import com.kodilla.patterns2.adapter.company.bookclassifier.libraryA.Book;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryA.Classifier;
import com.kodilla.patterns2.adapter.company.bookclassifier.libraryB.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adapter.company.bookclassifier.libraryB.Book> books = new HashMap<>();

        for (Book theBooks : bookSet) {
            books.put(new BookSignature(theBooks.getSignature()), new com.kodilla.patterns2.adapter.company.bookclassifier
                    .libraryB.Book(theBooks.getAuthor(), theBooks.getTitle(), theBooks.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
