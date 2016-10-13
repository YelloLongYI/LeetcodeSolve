package Leetcode;

public class Test136 {
	
	public int singleNumber(int[] nums) {
		int result=0;
		for(int i=0;i<nums.length;i++)
			result=result^nums[i];
		return result;
	}

	public static void main(String[] args) {
		// Single Number
		Test136 test=new Test136();
		int[] nums=new int[]{1,1,3,4,5,3,5,6,4};
		System.out.println(test.singleNumber(nums));
	}

}
