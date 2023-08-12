/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++)
		{
		    int a = in.nextInt();
		    if(a>=1 && a<100)
		    {
		        System.out.println("Easy");
		    }
		    else if(a>=100 && a<200)
		    {
		        System.out.println("Medium");
		    }
		    else
		    {
		        System.out.println("Hard");
		    }
		}
	}
}
