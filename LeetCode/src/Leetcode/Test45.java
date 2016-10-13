package Leetcode;

public class Test45 {
	
    public int jump(int[] nums) {
    	int[] dist=new int[nums.length];
        int maxdist=0;
        int temp=0;
        for(int i=0;i<nums.length;i++)
        {
        	temp=nums[i];
        	if(i>maxdist)
        		return -1;
        	if(i+temp>maxdist)
        	{
        		for(int j=maxdist+1;j<=i+temp&&j<nums.length;j++)
        			dist[j]=dist[i]+1;
        		maxdist=i+temp;
        	}
        }
        return dist[nums.length-1];
    }

	public static void main(String[] args) {
		// Jump Game II
		Test45 test=new Test45();
		int[] nums=new int[]{1,1,1,1};
		System.out.println(test.jump(nums));

	}

}
