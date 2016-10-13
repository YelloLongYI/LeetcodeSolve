package Leetcode;
import java.util.*;

public class Test241 {
	
	public List<Integer> merge(char op,List<Integer> list1,List<Integer> list2)
	{
		List<Integer> result=new ArrayList<Integer>();
		Iterator<Integer> iter1=list1.iterator();
		Integer a;
		switch(op)
		{
			case '+':while(iter1.hasNext()){a=iter1.next();Iterator<Integer> iter2=list2.iterator();while(iter2.hasNext())result.add(a+iter2.next());}break;
			case '-':while(iter1.hasNext()){a=iter1.next();Iterator<Integer> iter2=list2.iterator();while(iter2.hasNext())result.add(a-iter2.next());}break;
			case '*':while(iter1.hasNext()){a=iter1.next();Iterator<Integer> iter2=list2.iterator();while(iter2.hasNext())result.add(a*iter2.next());}break;
		}
		return result;
	}
	
	public List<Integer> calculate(String a,int start,int end)
	{
		List<Integer> result=new ArrayList<Integer>();
		if(a.substring(start,end).split("\\+|\\-|\\*").length==1)
		{
			result.add(Integer.parseInt(a.substring(start,end)));
			return result;
		}	
		for(int i=start;i<end;i++)
		{
			if(a.charAt(i)=='+'||a.charAt(i)=='-'||a.charAt(i)=='*')
			{
			    List<Integer> list1=calculate(a,start,i);
			    List<Integer> list2=calculate(a,i+1,end);
			    result.addAll(merge(a.charAt(i),list1,list2));
			}
		}
		return result;
	}
	
    public List<Integer> diffWaysToCompute(String input) {
        String[] a=input.split("\\+|\\-|\\*");
        return calculate(input,0,input.length());
    }

	public static void main(String[] args) {
		// Different Ways to Add Parentheses
		Test241 test=new Test241();
		System.out.println(test.diffWaysToCompute("11"));

	}

}
