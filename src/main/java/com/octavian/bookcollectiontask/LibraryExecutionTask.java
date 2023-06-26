package com.octavian.bookcollectiontask;

import java.util.HashMap;
import java.util.Map;

public class LibraryExecutionTask {
    public static void main(String[] args) {
        Book book1984 =new Book("1984", "George Orwell");
        Book buyologyBook = new Book("buylogy", "Martin Lindstrom");
        Book oameniBook = new Book("oamenii fericiti", "Martin L.");
        Book ionBook = new Book("Ion", "L.Rebreanu");

        Library classicLibrary= new Library("Librarius");
        classicLibrary.addBook(buyologyBook);
        classicLibrary.addBook(oameniBook);
        classicLibrary.addBook(buyologyBook,oameniBook);

        classicLibrary.printAllBooks();

        System.out.println("NUmarul total de carti este "  + classicLibrary.returnLibraryNumber());

        classicLibrary.removeBook(2);

        classicLibrary.removeBook(book1984);
        System.out.println("NUmarul total de carti este "  + classicLibrary.returnLibraryNumber());

        Library literaLibrary = new Library("Litera");
        literaLibrary.addBook(ionBook,ionBook);
        literaLibrary.addBook(book1984,buyologyBook);
        literaLibrary.addBook(oameniBook);

        System.out.println(literaLibrary.returnLibraryNumber());


        Map<String, Library> libraryNetwork = new HashMap<>();
        libraryNetwork.put("str.Arborilor 22", classicLibrary);
        libraryNetwork.put("str Grigore Vieru 14", literaLibrary);

        libraryNetwork.get("str Grigore Vieru 14").addBook(ionBook);
        libraryNetwork.get("str Grigore Vieru 14").printAllBooks();
        libraryNetwork.get("str.Arborilor 22").addBook(book1984);
        libraryNetwork.get("str.Arborilor 22").printAllBooks();

        libraryNetwork.get("str.Arborilor 22").addAnotherListOfBookIntoLibraryList(literaLibrary.getBookList());
        libraryNetwork.get("str.Arborilor 22").printAllBooks();

    }
}
