package Leetcode;

public class Test238 {
	
    public int[] productExceptSelf(int[] nums) 
    {
        int mult=1;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
        	if(nums[i]==0)
        		count++;
        	else
        		mult=mult*nums[i];
        }
        int[] nums1=new int[nums.length];
        if(count>=2)
        	return nums1;
        for(int i=0;i<nums1.length;i++)
        {
        	if(nums[i]==0)
        		nums1[i]=mult;
        	else if(count==0)
        		nums1[i]=mult/nums[i];
        	else
        		nums1[i]=0;
        }
        return nums1;
    }
    
    
	
	public static void main(String[] args)
	{
		Test238 test=new Test238();
		PrintResult print=new PrintResult();
		int[] nums=new int[]{1,0};
		int[] nums1=test.productExceptSelf(nums);
		print.printarray(nums1);
	}
}
