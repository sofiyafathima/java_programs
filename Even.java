
package even;
import java.util.*;
import java.io.*;
import java.lang.*;


/**
 *
 * @author MSAJCE-CSE31
 */
public class Even {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    int num = s.nextInt();
     System.out.println("Enter your number:");
     if(num%2==0)
     {
         System.out.println(num+"number is even");
     }
     else
     {
         System.out.println(num+"number is odd");
     }
    }
}
  

