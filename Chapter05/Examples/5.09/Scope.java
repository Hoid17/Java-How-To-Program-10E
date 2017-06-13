// Fig. 5.9: Scope.java
// Scope class demonstrates field and local variable scopes.
package pkg5_09;

public class Scope {

    // field that is accessible to all methods of this class
    private static int x = 1;
    
    // method main creates and initializes local variable x
    // and calls methods useLocalVariable and useField
    public static void main(String[] args) {
        
        int x = 5; // method's local variable x shadows field x
        
        System.out.printf("local x in main is %d%n", x);
        
        useLocalVariable(); // useLocalVariable has local x
        useField(); // useField uses class Scope's field x
        useLocalVariable(); // useLocalVariable reinitializes local x
        useField(); // class Scope's field x retains its value
        
        System.out.printf("%nlocal x in main is %d%n", x);       
    } // end method main
    
    // create and initialize local variable x during each call
    public static void useLocalVariable()
    {
        int x = 25; // initialized each time useLocalVariable is called
        
        System.out.printf(
           "%n local x on entering method useLocalVariable is %d%n", x);
        ++x; // modifies this method's local variable x
        System.out.printf(
           "local x before exiting ethod useLocalVariable is %d%n", x);
    } // end method useLocalVariable
    
    // modify class Scope's field x during each call
    public static void useField()
    {
        System.out.printf(
           "%nfield x on entering method useField is %d%n", x);
        x *= 10; // modifies class Scope's field x
        System.out.printf(
           "field x before exiting method useField is %d%n", x);
    } // end method useField
} // end class Scope
