package Leetcode;
import java.util.*;


class Cmp implements Comparator<String>{
	public int compare(String a,String b)
	{
		String s1=a+b;
		String s2=b+a;
		if(s1.compareTo(s2)>0)
			return 1;
		else
			return -1;
		
	}
}



public class Test179 {
	
    public String largestNumber(int[] nums) {
    	String[] s=new String[nums.length];
		for(int i=0;i<s.length;i++)
			s[i]=""+nums[i];
		Arrays.sort(s,new Cmp());
		String result="";
		if(s[s.length-1].equals("0"))
			return "0";
		for(int i=nums.length-1;i>=0;i--)
			result=result+s[i];
		return result;
    }

	public static void main(String[] args) {
		// Largest Number 
		Test179 test=new Test179();
		
		int[] a=new int[]{3,30,34,5,9};
		
	
		System.out.println(test.largestNumber(a));
		


	}


}
