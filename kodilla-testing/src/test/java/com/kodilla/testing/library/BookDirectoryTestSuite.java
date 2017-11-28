package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<Book>();
        for(int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title " + n, "Author " + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    public void testListBooksWithConditionsReturnList() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<Book>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBooksWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        // When
        List<Book> theListOfBooks = bookLibrary.listBooksWithCondition("Secret");

        // Then
        assertEquals(4, theListOfBooks.size());
    }

    @Test
    public void testListBooksWithConditionMoreThan20() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBooksWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBooksWithCondition("FourtyBooks"))
                .thenReturn(resultListOf40Books);

        // When
        List<Book> theListOfBooks0 = bookLibrary.listBooksWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBooksWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBooksWithCondition("FourtyBooks");

        // Then
        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        // Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBooksWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        // When
        List<Book> theListOfBooks10 = bookLibrary.listBooksWithCondition("An");

        // Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBooksWithCondition(anyString());
    }
    @Test
    public void testLibraryUserHasNoBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser user1 = new LibraryUser("Adam", "Smith", "8010081234");
        List<Book> listOfBooksOfUser1 = new ArrayList<>();
        when(libraryDatabaseMock.listBooksInHandsOf(user1)).thenReturn(listOfBooksOfUser1);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user1);

        //Then
        assertEquals(0, theListOfBooks.size());
    }
    @Test
    public void testLibraryUserHasN1Book() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser user2 = new LibraryUser("Adam", "Smith", "8010081234");
        Book book = new Book("Secrets of Java", "Ian Tenewitch", 2010);

        List<Book> listOfBooksOfUser2 = new ArrayList<>();
        listOfBooksOfUser2.add(book);
        when(libraryDatabaseMock.listBooksInHandsOf(user2)).thenReturn(listOfBooksOfUser2);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user2);

        //Then
        assertEquals(1, theListOfBooks.size());
    }

    @Test
    public void testLibraryUserHas5Books() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        LibraryUser user3 = new LibraryUser("Adam", "Smith", "8010081234");
        Book book1 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book2 = new Book("Programmers", "Steve Wolkowitz", 2016);
        Book book3 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        Book book4 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book5 = new Book("Secrets of Alamo", "John Smith", 2008);

        List<Book> listOfBooksOfUser3 = new ArrayList<>();
        listOfBooksOfUser3.add(book1);
        listOfBooksOfUser3.add(book2);
        listOfBooksOfUser3.add(book3);
        listOfBooksOfUser3.add(book4);
        listOfBooksOfUser3.add(book5);
        when(libraryDatabaseMock.listBooksInHandsOf(user3)).thenReturn(listOfBooksOfUser3);

        //When
        List<Book> theListOfBooks = bookLibrary.listBooksInHandsOf(user3);

        //Then
        assertEquals(5, theListOfBooks.size());
    }
}
