// Test class for IntegerSet
// @Author: Adam Janecka
package pkg8_13;

public class IntegerSetTest {
    
    public static void main(String args[])
    {
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();
        
        // Displays initial set; values empty
        System.out.printf("Set1: %s%nSet2: %s%n", set1, set2);
        
        // Add elements to both sets
        set1.insertElement(5);
        set1.insertElement(8);
        set1.insertElement(11);
        set2.insertElement(11);
        set2.insertElement(17);
        set2.insertElement(23);
        
        // Displays new outcome
        System.out.printf("%nNew sets%nSet1: %s%nSet2: %s%n", set1, set2);
        System.out.printf("Union: %s%n", set1.union(set2).toString());
        System.out.printf("Intersection: %s%n", set1.intersect(set2).toString());
        
        // Delete some elements
        set1.deleteElement(5);
        set2.deleteElement(23);
        
        // Display new outcome
        System.out.printf("%nNew sets%nSet1: %s%nSet2: %s%n", set1, set2);
    } // end method main
} // end class IntegerSetTest 
