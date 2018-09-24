/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;
import java.io.*;
import java.util.*;
import java.lang.*;

/**
 *
 * @author MSAJCE
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i ,k,total=0;
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       int arr[] = new int[n];
       System.out.println("enter the elements");
       for(i=0;i<n;i++){
           arr[i] = s.nextInt();
    }

   k = s.nextInt();
   for(i=0;i<k;i++)
   {
    total = total + arr[i];
    
}
 System.out.println(total);
}
}