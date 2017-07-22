// Fig. 7.16: GradeBook.java
// GradeBook class using a two-dimensional array to store grades
package pkg7_15;
import java.util.Scanner;

public class GradeBook {

    private String courseName; // name of course this book represents
    private int[][] grades; // two - dimensional array of student grades
    
    // Creates arguments for number of students and exams
    public GradeBook(String courseName, int students, int exams)
    {
        this.courseName = courseName;
        this.grades = new int[students][exams];
        for (int i = 0; i < grades.length; i++)
        {
            for (int j = 0; j < grades[0].length; j++)
                grades[i][j] = -1;      
        }
    } // end constructor
    
    // Allows the teacher to set a specific grade
    public void setGrade(int students, int exams)
    {
        Scanner input = new Scanner(System.in);
        if (students <= grades.length && exams <= grades[0].length)
        {
            System.out.print("Enter grade: ");
            int score = input.nextInt();
            grades[students - 1][exams - 1] = score;
        }
    } // end method setGrade
    
    // method to set the course name
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    } // end method setCourseName
    
    // method to retrieve the course name
    public String getCourseName()
    {
        return courseName;
    } // end method getCourseName
    
    // perform various operations on the data
    public void processGrades()
    {
        // output grades array
        outputGrades();
        
        // call methods getMinimum and getMaximum
        System.out.printf("%n%s %d%n%s %d%n%n",
                "Lowest grade in the book is", getMinimum(),
                "Highest grade in the grade book is", getMaximum());
        
        // output grade distribution chart of all grades on all tests
        outputBarChart();
    } // end method processGrades
    
    // find minimum grade
    public int getMinimum()
    {
        // assume first element of grades array is smallest
        int lowGrade = grades[0][0];
        
        // loop through rows of grades array
        for (int[] studentGrades: grades)
        {
            // loop through columns of current row
            for (int grade: studentGrades)
            {
                // if grade less than lowGrade, assign it to lowGrade
                if (grade < lowGrade)
                    lowGrade = grade;
            }
        }
        return lowGrade;
    } // end method getMinimum
    
    // find maximum grade
    public int getMaximum()
    {
        // assume first element of grades array is largest
        int highGrade = grades[0][0];
        
        // loop through rows of grades array
        for (int[] studentGrades: grades)
        {
            // loop through columns of current row
            for (int grade: studentGrades)
            {
                // if grade greater than highGrade, assign it to highGrade
                if (grade > highGrade)
                    highGrade = grade;
            }
        }
        return highGrade;
    } // end method getMaximum
    
    // determine average grade for particular set of grades
    public double getAverage(int[] setOfGrades)
    {
        int total = 0;
        
        // sum grades for one student
        for (int grade: setOfGrades)
            total += grade;
        
        // return average of grades
        return (double) total / setOfGrades.length;
    } // end method getAverage
    
    // output bar chart displaying overall grade distribution
    public void outputBarChart()
    {
        System.out.println("Overall grade distribution:");
        
        // stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];
        
        // for each grade in GradeBook, increment the appropriate frequency
        for (int[] studentGrades: grades)
        {
            for (int grade: studentGrades)
                ++frequency[grade / 10];
        }
        
        // for each grade frequency, print bar in chart
        for (int count = 0; count < frequency.length; count++)
        {
            // output bar label ("00-09: ", ..., "90-99: ", "100: ")
            if (count == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ",
                        count * 10, count * 10 + 9);
            
            // print bar of asterisks
            for (int stars = 0; stars < frequency[count]; stars++)
                System.out.print("*");
            
            System.out.println();
        }
    } // end method outputBarChart
    
    // output the contents of the grades array
    public void outputGrades()
    {
        System.out.printf("The grades are:%n%n");
        System.out.print("            "); // align column heads
        
        // create a column heading for each of the tests
        for (int test = 0; test < grades[0].length; test++)
            System.out.printf("Test %d  ", test + 1);
        
        System.out.println("Average"); // studnet average column heading
        
        // create rows/columns of text representing array grades
        for (int student = 0; student < grades.length; student++)
        {
            System.out.printf("Student %2d", student + 1);
            
            for (int test : grades[student]) // output student's grades
                System.out.printf("%8d", test);
            
            // call method getAverage to calculate student's average grade;
            // pass row of grades as the argument to getAverage
            double average = getAverage(grades[student]);
            System.out.printf("%9.2f%n", average);
        }
    } // end method outputGrades
} // end class GradeBook
