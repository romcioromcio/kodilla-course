package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Potop", "Henryk Sienkiewicz", LocalDate.of(1886, 1, 1));
        Book book2 = new Book("Dziady", "Adam Mickiewicz", LocalDate.of(1823, 1, 1));
        Book book3 = new Book("Czysty kod", "Robert C. Martin", LocalDate.of(2014, 10, 15 ));
        Book book4= new Book("Spring w akcji","Craig Walls",LocalDate.of(2015,1,1));

        Library library = new Library("collection 1");

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library shallowClonedLibrary = null;
        try {
            shallowClonedLibrary = library.shallowCopy();
            shallowClonedLibrary.setName("collection 2");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("collection 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(shallowClonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(3, shallowClonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedLibrary.getBooks().size());
        System.out.println("collection 1 consists of: " + library.getBooks().size() + " elements");
        System.out.println("collection 3 consists of: " + shallowClonedLibrary.getBooks().size() + " elements");
        System.out.println("collection 2 consists of: " + deepClonedLibrary.getBooks().size() + " elements");
    }
}
