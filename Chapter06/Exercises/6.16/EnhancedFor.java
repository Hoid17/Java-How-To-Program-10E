// Calculate the sum of arguments from the command line
// @Author: Adam Janecka
package pkg6_16;

public class EnhancedFor {

    public static void main(String[] args) {
        
        if(args.length == 0)
            System.out.print("No arguments input.\n");
        else
        {
            double total = 0.0;
            
            for (String s : args)
            {
                double d = Double.parseDouble(s); // Turn argument into double value
                total += d;
            }
            System.out.printf("Sum: %.2f\n", total);
        }
    } // end method main
} // end class EnhancedFor
