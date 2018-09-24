
package expo;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Expo {

    
    public static void main(String[] args) {
        int base = 2 , exponent =3 ;
       Scanner s = new Scanner(System.in);
       int num = s.nextInt();
       long result = 1;
       while(exponent!=0)
       {
           result *= base;
           --exponent;
       }
    System.out.println(result+ "Answer:");
    }
    
}
