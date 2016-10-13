package Leetcode;
import java.util.*;


public class Test51 {
	
	public boolean judge(int[] x,int depth)
	{
		if(depth==0)
			return true;
		for(int i=0;i<depth;i++)
		{
			if((depth-i)==Math.abs(x[depth]-x[i])||x[depth]==x[i])
				return false;
		}
		return true;
	}
	
	public List<String> print(int[] x)
	{
		List<String> solve=new ArrayList<String>();
		for(int i=0;i<x.length;i++)
		{
			String s="";
			for(int j=1;j<=x.length;j++)
				if(j==x[i])
					s+="Q";
				else
					s+=".";
			solve.add(s);
		}
		for(int i=0;i<solve.size();i++)
			System.out.println(solve.get(i));
		System.out.println("--------");
		return solve;
	}
	
	public void NQueens(int n)
	{
		int[] x=new int[n];
		Arrays.fill(x, 0);
		int depth=0;
		int count=0;
		while(depth>=0)
		{
			x[depth]++;
			while(judge(x,depth)==false&&x[depth]<=n)
				x[depth]++;
			if(x[depth]<=n)
			{
				if(depth==n-1)
				{
					print(x);
					x[depth]=0;
					depth--;
					count++;
				}
				else
					depth++;
			}
			else
			{
				x[depth]=0;
				depth--;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Test51 test=new Test51();
	    test.NQueens(8);

	}
}
