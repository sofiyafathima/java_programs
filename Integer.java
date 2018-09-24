/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package integer;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num =3456,count=0;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        while(num!=0)
        {
            num = num/10;
            ++count;
        }
        System.out.println(count+"number of digits");
    }
     
} 
       
            
       

