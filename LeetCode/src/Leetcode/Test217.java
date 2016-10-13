package Leetcode;
import java.util.*;

public class Test217 {
	
    public boolean containsDuplicate(int[] nums) {
    	if(nums.length==0||nums.length==1)
    		return false;
    	HashSet<Integer> set=new HashSet<Integer>();
    	for(int i=0;i<nums.length;i++)
    	{
    		if(set.contains(nums[i]))
    			return true;
    		else
    			set.add(nums[i]);
    	}
    	return false;
        
    }

	public static void main(String[] args) {
		Test217 test=new Test217();
		int[] nums=new int[]{1,2,2};
		System.out.println(test.containsDuplicate(nums));

	}

}
