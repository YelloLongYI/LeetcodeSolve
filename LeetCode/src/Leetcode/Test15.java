package Leetcode;

import java.util.*;

public class Test15 {
	
    public List<List<Integer>> threeSum(int[] nums) {
    	Arrays.sort(nums);
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	int itemp=0x7fffffff;
    	for(int i=0;i<nums.length-2;i++)
    	{
    		if(nums[i]==itemp)
    			continue;
    		int prior=i+1,rear=nums.length-1;
    		while(prior<rear)
    		{
    			if(nums[prior]+nums[rear]>-nums[i])
    				rear--;
    			else
    				if(nums[prior]+nums[rear]<-nums[i])
    					prior++;
    				else
    				{
    					result.add(new ArrayList<Integer>(Arrays.asList(new Integer[]{nums[i],nums[prior],nums[rear]})));
    					int temp=nums[prior];
    					while(prior<nums.length&&nums[prior]==temp)
    						prior++;
    					temp=nums[rear];
    					while(rear>i&&nums[rear]==temp)
    						rear--;
    				}
    		}
    		itemp=nums[i];
    	}
    	return result;
    	
    }

	public static void main(String[] args) {
		// 	3Sum
		Test15 test=new Test15();
		int[] nums=new int[]{0,-4,-1,-4,-2,-3,2};
		test.threeSum(nums);
		System.out.println("ok");
	}

}
