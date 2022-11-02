package patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LibraryTestSuite {
    @Test
    void testGetBook() {
        Library library = new Library("Test Library");
        IntStream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> library.getBooks().add(new Book("Book number: " + n, "Author " + n, LocalDate.now())));
        Book testBook = new Book("Test", "Test", LocalDate.now());
        library.getBooks().add(testBook);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(testBook);

        //Then
        System.out.println(library.getBooks().size());
        System.out.println(clonedLibrary.getBooks().size());
        System.out.println(deepClonedLibrary.getBooks().size());
        assertEquals(10, library.getBooks().size());
        assertEquals(10, clonedLibrary.getBooks().size());
        assertEquals(11, deepClonedLibrary.getBooks().size());

    }
}
