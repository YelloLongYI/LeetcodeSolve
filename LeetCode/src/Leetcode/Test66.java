package Leetcode;
import java.util.*;

public class Test66 {
	
    public int[] plusOne(int[] digits) {
        int tag=0,sum=0;
        List<Integer> number=new ArrayList<Integer>();
        sum=digits[digits.length-1]+1;
        number.add(sum%10);
        tag=sum/10;
        for(int i=digits.length-2;i>=0;i--)
        {
        	sum=digits[i]+tag;
        	number.add(sum%10);
        	tag=sum/10;
        }
        if(tag==1)
        	number.add(1);
        int[] result=new int[number.size()];
        for(int i=0;i<result.length;i++)
        	result[i]=number.get(result.length-i-1);
        return result;
    }

	public static void main(String[] args) {
		// Plus One
		Test66 test=new Test66();
		int[] a=new int[]{9,9,9};
		PrintResult pr=new PrintResult();
		int[] num=test.plusOne(a);
		pr.printarray(num);

	}

}
