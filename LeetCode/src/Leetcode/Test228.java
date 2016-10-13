package Leetcode;
import java.util.*;

public class Test228 {
	
    public List<String> summaryRanges(int[] nums) 
    {
    	List<String> range=new ArrayList<String>();
    	if(nums.length==0)
    		return range;
    	int prior=nums[0],start=nums[0];
    	
    	for(int i=1;i<nums.length;i++)
    	{
    		if((nums[i]-prior)==1)
    			prior=nums[i];
    		else
    		{
    			if(prior==start)
    				range.add(""+prior);
    			else
    				range.add(""+start+"->"+prior);
    			prior=nums[i];
    			start=nums[i];
    		}
    	}
    	if(prior==start)
			range.add(""+prior);
		else
			range.add(""+start+"->"+prior);
    	return range;
    }

	public static void main(String[] args)
	{
		Test228 test=new Test228();
		int[] nums=new int[]{0,1,2,4,5,7,8,9};
		System.out.println(test.summaryRanges(nums));
	}
}
