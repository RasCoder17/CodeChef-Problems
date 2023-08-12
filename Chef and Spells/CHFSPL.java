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
		for(int i=0; i<n;i++)
		{
		    int a = in.nextInt();
		    int b = in.nextInt();
		    int c = in.nextInt();
		    int arr[] = {a,b,c};
		    Arrays.sort(arr);
		    System.out.println(arr[2] + arr[1]);
		}
	}
}
