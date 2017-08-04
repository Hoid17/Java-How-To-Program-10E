// Fig. 8.11: EnumTest.java
// Testing enum type Book
package pkg8_11;
import java.util.EnumSet;

public class EnumTest {

    public static void main(String[] args) {
        System.out.println("All books:");
        
        // print all books in enum Book
        for (Book book : Book.values())
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());
        
        System.out.printf("%nDisplay a range of enum constants:%n");
        
        // print first four books
        for (Book book : EnumSet.range(Book.JHTP, Book.CPPHTP))
            System.out.printf("%-10s%-45s%s%n", book,
                    book.getTitle(), book.getCopyrightYear());  
    } // end method main
} // end class EnumTest
