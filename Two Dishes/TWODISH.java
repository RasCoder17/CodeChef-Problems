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
		int count=0;
		int num = in.nextInt();
		for(int i=0; i<num; i++)
		{
		    int n = in.nextInt();
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    if (b>=n && a+c>=n){ 
		    System.out.println("YES");
		    }
		else {
		    System.out.println("NO");
		}
		}
	}
}
