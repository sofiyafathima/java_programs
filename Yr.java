/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package yr;
 import java.util.*;
import java.io.*;
import java.lang.*;

/**
 *
 * @author MSAJCE-CSE31
 */
public class Yr {

 
    public static void main(String[] args) {
    Scanner leap = new Scanner(System.in);
        int year;
      year = leap.nextInt();
 
      System.out.println("Enter the year :");
    
      if (year%4==0)
      {
          System.out.println("it is a leap year") ;
     }
      else 
      {
          System.out.println("it is not leap year");// TODO code application logic here
    }
}
}
