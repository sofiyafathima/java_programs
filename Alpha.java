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
    private static char a;
    private static char z;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args, char A) {
       char ch,Z = 0;
       Scanner s = new Scanner(System.in);
       ch = s.next().charAt(0);
       System.out.println("Enter your alphabet");
       
       if(ch>=a && ch<=z) 
           {
       System.out.println(ch+"is a alphabet");
       }
       if(ch>=A && ch<=Z)
       {
           System.out.println(ch+"is a alphabet");
       }
       else
       {
           System.out.println(ch+"is not a alphabet");
       }
    }
}

