/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node
{
    int val;
    Node next;
    Node(int val)
    {
        this.val = val;
    }
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Node root = new Node(in.nextInt());
		Node cur = root;
		Node temp = null;
		for(int i=1; i<n; i++)
		{
		    temp = new Node(in.nextInt());
		    cur.next = temp;
		    cur = temp;
		}
		temp = root;
		Node prev = null;
		while( temp!=null)
		{
		    Node temp2 = temp.next;
		    temp.next = prev;
		    prev = temp;
		    temp = temp2;
		}
		root = prev;
        temp = root;
         
         while ( temp != null ) {
             System.out.print( temp.val + " " );
             temp = temp.next;
         }
		
		
	}
}
