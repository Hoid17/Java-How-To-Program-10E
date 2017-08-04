// Fig. 8.9: EmployeeTest.java
// Composition demonstration
package pkg8_09;

public class EmployeeTest {

    public static void main(String[] args) {
        
        Date birth = new Date(7, 24, 1949);
        Date hire = new Date(3, 12, 1988);
        Employee employee = new Employee("Bob", "Blue", birth, hire);
        
        System.out.println(employee);
    } // end method main
} // end class EmployeeTest
