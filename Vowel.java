
package vowel;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Vowel {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int ch;
       System.out.println("Enter yor alphabet");
       ch = s.next().charAt(0);
      if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
      {
          System.out.println(ch+"vowels");
      }
      else
      {
          System.out.println("consonant");
      }
    }
}
      
    

