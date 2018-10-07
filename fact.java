import java.util.*;
import java.lang.*;
import java.io.*;


public class factorial
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 int n,i,fact=1;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
            
        }
        System.out.println(fact+"factorial number is");
    

	}
}
