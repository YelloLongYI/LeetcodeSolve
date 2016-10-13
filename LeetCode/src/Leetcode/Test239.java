package Leetcode;
import java.util.*;

public class Test239 {
	
    public int[] maxSlidingWindow(int[] nums, int k)
    {
	    if(nums.length==0)
		    return new int[0];
	    int[] a=new int[nums.length-k+1];
            for(int i=0;i<nums.length-k+1;i++)
            {
        	    int max=0x80000000;
        	    for(int j=i;j<i+k;j++)
        		    if(nums[j]>max)
        			    max=nums[j];
        	    a[i]=max;
            }
            return a;
     }
    
    public int[] maxSlidingWindow1(int[] nums, int k)
    {
	    if(nums.length==0)
		    return new int[0];
	    int[] a=new int[nums.length-k+1];
	    ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
	    for(int i=0;i<k;i++)
	    {
	    	
	    	if(dq.isEmpty())
	    	{
	    		dq.addLast(i);
	    	}
	    	else
	    	{
	    		
	    		if(nums[dq.peekFirst()]<nums[i])
	    		{
	    			dq.clear();
	    			dq.addLast(i);
	    		}
	    		if(nums[dq.peekLast()]>nums[i])
	    			dq.addLast(i);
	    		else
	    		{
	    		    while(nums[dq.peekLast()]<nums[i])
	    			    dq.pollLast();
	    		    dq.addLast(i);
	    		}
	    	}
	    }
	   
	    for(int i=k-1;i<nums.length;i++)
	    {
	    	while(!dq.isEmpty()&&dq.peekFirst()<i-k+1)
    			dq.pollFirst();
	    	if(dq.isEmpty())
	    	{
	    		dq.addLast(i);	
	    	}
	    	else
	    	{
	    		if(nums[dq.peekFirst()]<nums[i])
	    		{
	    			dq.clear();
	    			dq.addLast(i);
	    		}
	    		if(nums[dq.peekLast()]>nums[i])    		
	    			dq.addLast(i);
	    		else
	    		{
	    		    while(nums[dq.peekLast()]<nums[i])
	    			    dq.pollLast();
	    		    dq.addLast(i);
	    		}
	    	}
	    	a[i-k+1]=nums[dq.peekFirst()];
	    }
	   
	    return a;
     }
    
    public int[] maxSlidingWindow2(int[] nums, int k)
    {
	    if(nums.length==0||nums.length-k+1<0)
		    return new int[0];
	    int[] a=new int[nums.length-k+1];
	    LinkedList<Integer> que=new LinkedList<Integer>();
	    for(int i=0;i<nums.length;i++)
	    {
	    	while(!que.isEmpty()&&nums[que.getLast()]<nums[i])
	    		que.removeLast();
	    	que.add(i);
	    	if(que.getFirst()<i-k+1)
	    		que.removeFirst();
	    	if(i>=k-1)
	    		a[i-k+1]=nums[que.getFirst()];	
	    }
	   
	    return a;
     }

	public static void main(String[] args) {
		// Sliding Window Maximum 
		Test239 test=new Test239();
		PrintResult pr=new PrintResult();
		int[] a=new int[]{9,10,9,-7,-4,-8,2,-6};
		pr.printarray(test.maxSlidingWindow2(a, 5));

	}

}
