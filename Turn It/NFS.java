/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();
		
		while(testCase-- > 0){
		    int U = sc.nextInt();
		    int V = sc.nextInt();
		    int A = sc.nextInt();
		    int S = sc.nextInt();
		    
		    if(Math.pow(V,2) >= Math.pow(U,2)-2*A*S){
		        System.out.println("Yes");
		    }else{
		        System.out.println("No");
		    }
		}
	}
}
