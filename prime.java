package prime.java;
import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author MSAJCE
 */
 class PrimeJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num1,num2,i;
       Scanner s = new Scanner(System.in);
       num1 = s.nextInt();
       num2 = s.nextInt();
       while(num1<num2)
       {
       boolean flag = false;
       for(i=2;i<=num1/2;i++){
           if(num1%2==0)
           {
           flag = true;
            break;
           }
    }
       
       if(!flag)
       {
         System.out.println(num1+"");
         ++num1;
       }
    }
    }
}
