package Leetcode;
import java.util.*;
import java.util.Arrays;

public class Test5 {
		
    public String  longestPalindrome(String s) 
    {
    	char[] c=s.toCharArray();
    	int length=c.length;
    	String longest="";
    	boolean[][] matrix=new boolean[length][length];
    	for(int i=length-1;i>=0;i--)
    		for(int j=i;j<length;j++)
    		{
    			if(i==j)
    				matrix[i][j]=true;
    			else
    			{
    				if(c[i]!=c[j])
    					matrix[i][j]=false;
    				else
    				{
    					if(j-i==1)
    						matrix[i][j]=true;
    					else
    						matrix[i][j]=matrix[i+1][j-1];
    				}	
    			}
    			if(matrix[i][j]==true)
					if(j-i+1>longest.length())
						longest=s.substring(i, j+1);
    		}
    	return longest;
    }
	
	public static void main(String[] args)
	{
		Test5 test=new Test5();
		char[] a=new char[5];
		System.out.println(test.longestPalindrome("a"));

	}
}
