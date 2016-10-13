package Leetcode;
import java.util.*;

public class Test1 {
	
	public int[] twoSum(int[] nums, int target) {
        int index1=0,index2=0;
        label:
        for(int i=0;i<nums.length-1;i++)
        for(int j=i+1;j<nums.length;j++)
        if(nums[i]+nums[j]==target)
        {
            index1=i+1;
            index2=j+1;
            break label;
        }
        return new int[]{index1,index2};
    }
	
	
	public int[] twoSum1(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        map.put(nums[i],i);
        for(int i=0;i<nums.length;i++)
        if(map.containsKey(target-nums[i])&&map.get(target-nums[i])>i)
        {
            return new int[]{i+1,map.get(target-nums[i])+1};
        }
        return null;
    }
	
	public static void main(String[] args)
	{
		Test1 test=new Test1();
		test.twoSum1(new int[]{3,2,4}, 6);
	}
}
