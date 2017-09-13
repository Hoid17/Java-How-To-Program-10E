// Fig. 11.7: UsingChainedExceptions.java
// Chained exceptions.
package pkg11_07;

public class UsingChainedExceptions {

    public static void main(String[] args) {
        
        try{
            method1();
        }
        catch(Exception exception) // exceptions thrown from method1
        {
            exception.printStackTrace();
        }
    } // end method main
    
    // call method2; throw excpetions back to main
    public static void method1() throws Exception
    {
        try
        {
            method2();
        } // end try
        catch(Exception exception) // exception thrown from method2
        {
            throw new Exception("Exception thrown in method1", exception);
        }
    } // end method1
    
    // call method3; throw exceptions back to method1
    public static void method2() throws Exception
    {
        try
        {
            method3();
        }
        catch(Exception exception) // exception thrown from method3
        {
            throw new Exception("Exception thrown in method2", exception);
        }
    } // end method2
    
    // throw Exception back to method2
    public static void method3() throws Exception
    {
        throw new Exception("Exception thrown in method3");
    } // end method3
} // end class UsingChainedExceptions
