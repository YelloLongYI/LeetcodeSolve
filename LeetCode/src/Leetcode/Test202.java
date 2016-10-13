package Leetcode;
import java.util.*;

public class Test202 {
	 public boolean isHappy(int n) {
	        List<Integer> occur=new ArrayList<Integer>();
	        int num=n,sum=0,temp=n;
	        while(num!=1)
	        {
	            temp=num;
	            sum=0;
	            while(temp!=0)
	            {
	                sum=sum+(temp%10)*(temp%10);
	                temp=temp/10;
	            }
	            if(occur.contains(sum))
	            return false;
	            occur.add(sum);
	            if(sum==1)
	            return true;
	            num=sum;
	        }
	        return true;
	        
	    }
}
