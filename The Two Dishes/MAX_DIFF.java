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
		    int b = in.nextInt();
		    if(a>=b)
		    {
		        System.out.println(b);
		    }
		    else
		    {
		        System.out.println(a-(Math.abs(a-b)));
		    }
		}
	}
}
