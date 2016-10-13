package Leetcode;

import java.util.Arrays;

public class Test55 {
	
	public boolean canJump(int[] nums) {
        int num=0;
        int maxdist=0;
        for(int i=0;i<nums.length&&i<=maxdist;i++)
        {
        	maxdist=Math.max(maxdist, i+nums[i]);
        	if(maxdist>=nums.length-1)
        		return true;
        }
        return false;
		
    }

	public static void main(String[] args) {
		// Jump Game
		Test55 test=new Test55();
		int[] nums=new int[]{2,3,1,1,4};
		System.out.println(test.canJump(nums));

	}

}
