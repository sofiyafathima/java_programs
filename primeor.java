import java.util.*;
import java.io.*;
import java.lang.*;


public class Main {
   
    public static void main(String[] args) {
        int num=11,i;

       
        for(i=2; i<=num/2;i++)
        {

           if( num %i==0)
               {
                   System.out.println(num+ "yes");
        }
        else{
            System.out.println(num+ "no");
        }
    }
}
}
