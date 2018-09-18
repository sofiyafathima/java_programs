/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package alpha;

import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author MSAJCE-CSE31
 */
public class Alpha {
   
    
   
    public static void main(String[] args, char A) {
       char ch;
       
       Scanner s = new Scanner(System.in);
       
       System.out.println("Enter your alphabet");
       ch = s.next().charAt(0);
       
       if(ch>='a' && ch<='z')
           {
       System.out.println(ch+"is a alphabet");
       }
      else if(ch>='A' && ch<='Z')
       {
           System.out.println(ch+"is a alphabet");
       }
       else
       {
           System.out.println(ch+"is not a alphabet");
       }
    }
}

