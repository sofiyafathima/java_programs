import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {
   
    public static void main(String[] args) {
        int num=11,i;
        boolean flag = false;
       
        for(i=2; i<=num/2;i++)
        {

           if( num %i==0)
               {
            flag = true;
            break;

            }
        }
        if(!flag)
        {
            System.out.println(num+"yes");
        }
        else{
            System.out.println(num+"no");
        }
    }
}
      
