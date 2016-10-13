package Leetcode;

public class Test215 {
	
	public int partition(int[] nums,int start,int end)
	{
		int low=start,high=end;
		int temp;
		while(low!=high)
		{
			while(nums[high]>=nums[start]&&low<high)
				high--;
				
			while(nums[low]<=nums[start]&&low<high)
				low++;
			if(low<high)
			{
				temp=nums[low];
				nums[low]=nums[high];
				nums[high]=temp;
			}
		}
		temp=nums[low];
		nums[low]=nums[start];
		nums[start]=temp;
		return low;
	}
	
    public int findKthLargest(int[] nums, int k) 
    {
    	//length-k;
    	int index=0,start=0,end=nums.length-1;
    	int large=nums.length-k;
    	while(true)
    	{
    		index=partition(nums,start,end);
    		if(index>large)
    			end=index-1;
    		else if(index<large)
    			start=index+1;
    		else
    			return nums[index];
    	}
    }
	public static void main(String[] args)
	{
		Test215 test=new Test215();
		int[] nums=new int[]{-1,2,0};
		System.out.println(test.findKthLargest(nums, 1));
	}
}
