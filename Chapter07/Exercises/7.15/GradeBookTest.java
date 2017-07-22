// Application to test GradeBook class
// @Author: Adam Janecka
package pkg7_15;

public class GradeBookTest {

    public static void main(String[] args) {
        
        GradeBook book = new GradeBook("Java Programming", 4, 3);
        
        // Display initial gradebook
        book.outputGrades();
        
        // Enter grades for all exams 
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 3; j++)
                book.setGrade(i, j);
        }
        
        // Display new gradebook
        book.outputGrades();
    } // end method main
} // end class GradeBookTest
