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
		int N = in.nextInt();
		for(int i=0; i<N; i++)
		{
		    int a = in.nextInt();   //number of movies
		    int b = in.nextInt();  // Hard disk space
		    int max = 0;
		    for(int j=0; j<a; j++)
		    {
		        int c = in.nextInt(); //space required
		        int d = in.nextInt(); // IMDB rating
		        if(b>=c)
		        {
		            max = Math.max(max,d); 
		        }
		    }
		    System.out.println(max);
		}
	}
}
