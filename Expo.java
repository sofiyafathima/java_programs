/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo;
import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author MSAJCE
 */
public class Expo {

    /**
     * @param args the command line arguments
     */
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
