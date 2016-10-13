package Leetcode;

public class Test334 {
	
	public boolean increasingTriplet(int[] nums) {
		if(nums==null||nums.length<3)
			return false;
		int large=0x7fffffff,small=0x7fffffff;
		for(int i=0;i<nums.length;i++){
			if(nums[i]<=small){
				small=nums[i];
			}else if(nums[i]<=large){
				large=nums[i];
			}else
				return true;
		}
        return false;
    }
	
	public static void main(String[] args){
		Test334 test=new Test334();
		int[] arr=new int[]{1,1,1,2,3};
		System.out.println(test.increasingTriplet(arr));
	}
}
