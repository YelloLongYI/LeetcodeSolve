package Leetcode;
import java.util.*;

public class Test22 {
	
	public boolean judge(int[] a,int depth,int n)
	{
		int a1=0,a2=0;
		for(int i=0;i<=depth;i++)
		{
			if(a[i]==1)
				a1++;
			else
				a2++;
			if(a2>a1||a1>n)
				return false;
		}
		return true;
	}
	
	public String makestring(int[] a)
	{
		String s="";
		for(int i=0;i<a.length;i++)
			if(a[i]==1)
				s=s+"(";
			else
				s=s+")";
		return s;
	}
	
    public List<String> generateParenthesis(int n) {
    	List<String> result=new ArrayList<String>();
        int[] a=new int[2*n];
        int depth=0;
        while(depth!=-1)
        {
        	a[depth]++;
        	while(judge(a,depth,n)==false&&a[depth]<=2)
        		a[depth]++;
        	if(a[depth]<=2)
        	{
        		if(depth<2*n-1)
        			depth++;
        		else
        		{
        			result.add(makestring(a));
        			a[depth]=0;
        			depth--;
        		}
        	}
        	else
        	{
        		a[depth]=0;
        		depth--;
        	}
        }
        return result;
    }

	public static void main(String[] args) {
		//Generate Parentheses
		Test22 test=new Test22();
		System.out.println(test.generateParenthesis(3));

	}

}
