// Fig. 7.17: GradeBookTest.java
// GradeBookTest creates a GradeBook object using a two-dimensional array
// of grades, then invokes method processGrades to analyze them
package pkg7_17;

public class GradeBookTest {

    // main method begins program execution
    public static void main(String[] args) {
        
        // two-dimensional array of student grades
        int[][] gradesArray = {{87, 96, 70},
            {68, 87, 90},
            {94, 100, 90},
            {100, 81, 82},
            {83, 65, 85},
            {78, 87, 65},
            {85, 75, 83},
            {91, 94, 100},
            {76, 72, 84},
            {87, 93, 73}};
        
        GradeBook myGradeBook = new GradeBook(
        "CS101 Introduction to Java Programming", gradesArray);
        System.out.printf("Welcome to the grade book for%n%s%n%n",
                myGradeBook.getCourseName());
        myGradeBook.processGrades();        
    } // end method main
} // end class GradeBookTest
