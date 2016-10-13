package Leetcode;
import java.util.*;

public class Test164 {
	public int maximumGap(int[] nums)
	{
		if(nums==null||nums.length==1||nums.length==0)
			return 0;
		if(nums.length==2)
			return Math.abs(nums[0]-nums[1]);
		int max=0x80000000,min=0x7fffffff;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]>max)
				max=nums[i];
			if(nums[i]<min)
				min=nums[i];
		}

		int[] maxbkt=new int[nums.length-1],minbkt=new int[nums.length-1];
		Arrays.fill(minbkt, 0x7fffffff);
		Arrays.fill(maxbkt, 0x80000000);
		int maxgap=max-min;
		if(maxgap==0)
			return 0;
		double avegap=1.0*maxgap/(nums.length-1);
		
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==max)
				continue;
			int index=(int)((nums[i]-min)/avegap);
			if(nums[i]>maxbkt[index])
				maxbkt[index]=nums[i];
			if(nums[i]<minbkt[index])
				minbkt[index]=nums[i];
		}
		maxgap=0;
		int prior=0,rear=0;
		while(true)
		{
			rear=nextvalid(minbkt,maxbkt,prior);

			if(rear>0&&(minbkt[rear]-maxbkt[prior])>maxgap)
			{
				
				maxgap=minbkt[rear]-maxbkt[prior];
			}
			if(rear<0)
				break;
			prior=rear;
		}
		
		return Math.max(maxgap, max-maxbkt[prior]);

	}
	
	public int nextvalid(int[] minbkt,int[] maxbkt,int index)
	{
		for(int i=index+1;i<minbkt.length;i++)
			if(maxbkt[i]>=minbkt[i])
				return i;
		return -1;
	}
	
	public static void main(String[] args)
	{
		//int a=0x7fffffff;
		Test164 test=new Test164();
		int[] a=new int[]{15252,16764,27963,7817,26155,20757,3478,22602,20404,6739,16790,10588,16521,6644,20880,15632,27078,25463,20124,15728,30042,16604,17223,4388,23646,32683,23688,12439,30630,3895,7926,22101,32406,21540,31799,3768,26679,21799,23740};
		System.out.println("result="+test.maximumGap(a));
	}
}
