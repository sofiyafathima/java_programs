
package natural;
import java.io.*;
import java.util.*;
import java.lang.*;
public class Natural {

   
    public static void main(String[] args) {
        int num,count,total=0;
        Scanner s = new Scanner(System.in);
         System.out.println("Enter the number");
        num = s.nextInt();
        for(count=1;count<=num;count++)
            
        {
           //System.out.println(count+ "natural number upto N");
           total = total+count;
           
        }
         System.out.println(total);
    
    }
    }

    

