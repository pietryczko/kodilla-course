package com.kodilla.testing.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class BookDirectoryTestSuite {

    BookLibrary bookLibrary;

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    @BeforeEach
    void setUp() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
    }

    @Test
        // [1]
    void testListBooksWithConditionsReturnList() {                                      // [2]
        // Given
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);                  // [3]
        List<Book> resultListOfBooks = new ArrayList<>();                                // [4]
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret")).thenReturn(resultListOfBooks);// [13]

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");        // [14]

        // Then
        assertEquals(4, theListOfBooks.size());                                          // [15]
    }

    @Nested
    @DisplayName("Books With Condition Test")
    class testListBookWithCondition {
        @Test
        void testListBooksWithConditionMoreThan20() {

            // Given
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBooksWithCondition(Mockito.anyString()))
                    .thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                    .thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBooksWithCondition("FortyBooks"))
                    .thenReturn(resultListOf40Books);

            // When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
            List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FortyBooks");
            // Then

            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOfBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBooksWithConditionFragmentShorterThan3() {
            // Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            // When
            List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

            // Then
            assertEquals(0, theListOfBooks10.size());
            verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
        }
    }

    @Nested
    @DisplayName("BookInHandsOf Test")
    class testListBookInHandsOf {
        @Test
        void testListBookInHandsOf0() {
            //Given
            List<Book> resultListOfBooks = new ArrayList<>();
            LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "09876543210");

            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

            //when
            List<Book> theListOfBook = bookLibrary.listBookInHandsOf(libraryUser);

            //then
            assertEquals(0, theListOfBook.size());
        }

        @Test
        void testListBookInHandsOf1() {
            //Given
            List<Book> resultListOfBooks = new ArrayList<>();
            LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "09876543210");
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            resultListOfBooks.add(book1);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

            //when
            List<Book> theListOfBook = bookLibrary.listBookInHandsOf(libraryUser);

            //then
            assertEquals(1, theListOfBook.size());
        }

        @Test
        void testListBookInHandsOf5() {
            //Given
            List<Book> resultListOfBooks = new ArrayList<>();
            LibraryUser libraryUser = new LibraryUser("Jan", "Kowalski", "09876543210");
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
            Book book5 = new Book("Secrets of Python", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            resultListOfBooks.add(book5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOfBooks);

            //when
            List<Book> theListOfBook = bookLibrary.listBookInHandsOf(libraryUser);

            //then
            assertEquals(5, theListOfBook.size());
        }
    }
}
