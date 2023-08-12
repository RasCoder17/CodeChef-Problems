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
		for(int k=0; k<n; k++)
		{
		    int nn = in.nextInt();
		    int arr[] = new int[nn];
		    for(int mm=0; mm<nn; mm++)
		    {
		        int n1 = in.nextInt();
		        arr[mm] = n1;
		    }
		    for(int i=0; i<nn; i++)
		    {
		        for(int j= i + 1; j<nn; j++)
		        {
		            int temp=0;
		            if(arr[j] < arr[i])
		            {
		                temp = arr[i];
		                arr[i] = arr[j];
		                arr[j] = temp;		            
		            }
		        }
		}
		System.out.println(arr[1]);
		}

	}
}

