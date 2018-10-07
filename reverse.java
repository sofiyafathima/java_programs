import java.util.*;
import java.io.*;
import java.lang.*;
public class reverse{
    public static void main(String[] args){
        int num,r=123;
        Scanner s = new Scanner(System.in);
        System.out.println("enter your number:");
        num = s.nextInt();
        while(num!=0)
        {
         r = r*10;
         r = r+num%10;
         num=num/10;
            
        }
        System.out.println(r+"reverse number is");
    }
}
