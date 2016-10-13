package Leetcode;
import java.util.*;

public class Test67 {
	
//	public int StringToNumber(String s)
//	{
//		char[] temp=s.toCharArray();
//		int sum=0;
//		for(int i=0;i<temp.length;i++)
//		{
//			sum+=(temp[i]-48)*Math.pow(2, temp.length-i-1);
//		}
//		return sum;
//	}
//	
//	public List<Integer> NumberToString(int num)
//	{
//		List<Integer> temp=new ArrayList<Integer>();
//		while(num/2!=0)
//		{
//			temp.add(num%2);
//			num=num/2;
//		}
//		temp.add(num);
//		return temp;
//	}
	
	
	public static void main(String[] args)
	{
		Test67 test=new Test67();
		List<Integer> list=new ArrayList<Integer>();
		String s1="100",s2="110010",s;
		int count=0,index;
		char[] temp1=s1.toCharArray(),temp2=s2.toCharArray();
		int index1=temp1.length-1,index2=temp2.length-1;
		for(;index1>=0&&index2>=0;index1--,index2--)
		{
			list.add((temp1[index1]+temp2[index2]-96+count)%2);
			count=(temp1[index1]+temp2[index2]-96+count)/2;
		}
		if(index1<0)
		{
			s=s2;
			index=index2;
		}
		else
		{
			s=s1;
			index=index1;
		}
		char[] temp=s.toCharArray();
		for(int i=index;i>=0;i--)
		{
			list.add((temp[i]-48+count)%2);
			count=(temp[i]-48+count)/2;
		}
		if(count!=0)
			list.add(count);
		s="";
		for(int i=list.size()-1;i>=0;i--)
			s+=list.get(i);
		System.out.println();
		System.out.println(s);
	}
}
