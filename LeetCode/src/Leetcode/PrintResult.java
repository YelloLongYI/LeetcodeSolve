package Leetcode;
import java.util.*;

public class PrintResult {
	public static void printarray(int[] a)
	{
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"  ");
	}
	
	public static void printlist(ListNode list)
	{
		while(list!=null)
		{
			System.out.print(list.val+" ");
			list=list.next;
		}
		System.out.println();
	}
}
